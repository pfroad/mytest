package com.mall.test.test01.utils;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class FileHandleUtils {
	
	static String localFilePathSrc = "E:\\data\\aaa.f";
	static String localFilePathDst = "D:\\data\\bbb.f";
	static String hdfsFilePath = "hdfs://192.168.1.105:9000/temp/aaa.f";
	static String hdfsDirectoryPath = "hdfs://192.168.1.105:9000/temp";

	public static void writeFile() throws FileNotFoundException, IOException {
		Configuration conf = new Configuration();
		Path dstFile = new Path(hdfsFilePath);
		FileSystem fs = dstFile.getFileSystem(conf);
		fs.copyFromLocalFile(false, true, new Path(localFilePathDst), dstFile);
	}
	
	public static void readLine() throws FileNotFoundException, IOException {
		Configuration conf = new Configuration();
		Path srcFile = new Path(hdfsFilePath);
		FileSystem fs = srcFile.getFileSystem(conf);
		fs.copyToLocalFile(srcFile, new Path(localFilePathDst));
	}
	
	public static void listDirctory() throws FileNotFoundException, IOException {
		Configuration conf = new Configuration();
		Path file = new Path(hdfsDirectoryPath);
		FileSystem fs = file.getFileSystem(conf);
		FileStatus[] fileList = fs.listStatus(file);
		
		for (int i = 0; i < fileList.length; i++) {
			System.out.println("name:" + fileList[i].getPath().getName() + "\t\t size:" + fileList[i].getLen());
		}
	}
	
	public static void deleteFile() throws FileNotFoundException, IOException {
		Configuration conf = new Configuration();
		Path file = new Path(hdfsFilePath);
		FileSystem fs = file.getFileSystem(conf);
		fs.delete(file, true);	// 2nd argument is Recursion delete
	}
	
	public static void appendFile() throws FileNotFoundException, IOException {
		Configuration conf = new Configuration();
		Path file = new Path(hdfsFilePath);
		FileSystem fs = file.getFileSystem(conf);
		FSDataOutputStream out = fs.append(file);
		String outstr = "Hello Everyone!!";
		out.writeBytes(outstr);
		out.flush();
		out.close();
	}
}
