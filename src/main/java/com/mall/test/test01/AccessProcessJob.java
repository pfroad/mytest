package com.mall.test.test01;

import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.TextOutputFormat;
import org.apache.hadoop.mapred.FileInputFormat;

import com.sun.jersey.core.impl.provider.entity.XMLJAXBElementProvider.Text;

/**
 * Hello world!
 *
 */
public class AccessProcessJob 
{
    public static void main( String[] args ) {
    	String input = "hdfs://192.168.1.105:9000/temp/access.log";
    	String output = "hdfs://192.168.1.105:9000/temo/output/";
    	
    	JobConf conf = new JobConf(AccessProcessJob.class);
    	conf.setJobName("AccessProcessor");
    	
    	try {
			new Path(output).getFileSystem(conf).delete(new Path(output), true);
			
			conf.setOutputKeyClass(Text.class);
			conf.setOutputValueClass(Text.class);
			
			conf.setMapperClass(AccessProcessMap.class);
			conf.setReducerClass(AccessProcessReduce.class);
			
			conf.setInputFormat(TextInputFormat.class);
			conf.setOutputFormat(TextOutputFormat.class);
			//test remote
			FileInputFormat.setInputPaths(conf, new Path(input));
			FileOutputFormat.setOutputPath(conf, new Path(output));
			
			conf.setNumMapTasks(1);
			conf.setNumReduceTasks(1);
			JobClient.runJob(conf);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        System.out.println( "Hello World!" );
    }
}
