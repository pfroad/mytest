package com.mall.test.test01.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.apache.commons.io.FileUtils;

public class TestDataUtils {
	public static void mian(String[] args) throws IOException{
		String[] remote_add = { "124.109.222.29", "124.19.222.29",
				"124.119.22.59", "125.119.222.39", "126.119.222.29",
				"174.119.232.29", "124.119.202.29", "125.19.22.29" };
		
		String[] rt_time = { "21", "43", "67", "599", "12", "740", "230",
				"120", "455", "78", "98" };
		
		String[] request_method = {"GET", "POST"};
		
		String request_url = "www.xxx.com/index.html www.xxx.com/list.html www.xxx.com/detail.html www.xxx.com/userinfo.html www.xxx.com/publis.html";
		String refer = "www.google.com www.baidu.com www.taobao.com www.qq.com www.sina.com";
		String status = "200 301 302 404 500";
		String send_bytes = "3344 2789 490 439274 80834 31232 432004 49397 98324 48243 432943 432943";
		
		File file = new File("/home/hadoop/temp/ccc.f");
		
		for (int i = 0 ; i < 10000; i++) {
			String line = getOne(remote_add) + getOne(rt_time)
					+ getOne(request_method) + getOne(request_url.split(" "))
					+ getOne(refer.split(" ")) + getOne(status.split(" ")) 
					+ getOne(send_bytes.split(" "));
			
			ArrayList<String> lines = new ArrayList<String>();
			lines.add(line);
			FileUtils.writeLines(file, lines, true);
		}
	}
	
	public static String getOne(String[] array) {
		int len = array.length;
		Random r = new Random();
		int rand = r.nextInt(len);
		return array[rand] + "";
	}
}
