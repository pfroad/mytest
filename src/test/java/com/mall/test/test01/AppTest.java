package com.mall.test.test01;

import io.undertow.servlet.Servlets;
import io.undertow.servlet.api.ServletInfo;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.CRC32;

import javax.servlet.http.HttpServlet;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.mortbay.jetty.security.Credential.MD5;

import com.mall.test.test01.undertow.UndertowServer;
import com.mall.test.test01.undertow.anno.ServletMappings;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testAtomicInt(){
    	Map m1 = new HashMap();
    	m1.put("a", 1);
    	changeObject(m1);
    	
    	System.out.println(m1);
//    	System.out.println(m2);
    	
    	String str = "storeLabels: AND {!geofilt d= + 10000 / 1000 + }";
    	System.out.println(str.substring(str.indexOf("{"), str.lastIndexOf("}") + 1));
    }
    
    private void changeObject(Map m){
		String str = "{\"code\":200,\"msg\":\"请求成功\",\"result\":{\"count\":8,\"items\":[{\"description\":\"90年代复古代表鞋款，明星款五系列的新品型号。标志性的鞋舌，刺绣大N字logo，个性与复古。\",\"district\":\"越秀区\",\"presentShowUp\":4,\"price\":699.0,\"brand\":\"New Balance\",\"mall\":\"名盛广场\",\"business_region\":\"北京路步行街商圈\",\"views_count\":4,\"item_id\":763,\"item_name\":\"NewBalanceNB 男鞋 经典复古鞋 跑步鞋\",\"store_id\":78,\"store_name\":\"New Balance\",\"list_price\":799.0,\"image_url\":\"/uploads/item_image/201412181007131418868433235_302w.png\",\"image_width\":302,\"image_height\":279,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":117,\"price\":599.0,\"brand\":\"SELECTED\",\"mall\":\"太阳新天地购物中心\",\"business_region\":\"珠江新城商圈\",\"views_count\":0,\"item_id\":700,\"item_name\":\"色织细格纹面料修身剪裁休闲裤\",\"store_id\":76,\"store_name\":\"SELECTED\",\"list_price\":639.0,\"image_url\":\"/uploads/item_image/201412150343081418629388076_302w.jpg\",\"image_width\":250,\"image_height\":400,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":143,\"price\":1399.0,\"mall\":\"天河城\",\"business_region\":\"天河体育中心商圈\",\"views_count\":0,\"item_id\":723,\"item_name\":\"跑步 男子 boost跑步鞋 一号黑\",\"store_id\":77,\"store_name\":\"阿迪达斯\",\"list_price\":1499.0,\"image_url\":\"/uploads/item_image/201412170434231418805263781_302w.jpg\",\"image_width\":302,\"image_height\":135,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"海珠区\",\"presentShowUp\":159,\"price\":869.0,\"brand\":\"耐克\",\"mall\":\"万国广场\",\"business_region\":\"江南大道商圈\",\"views_count\":0,\"item_id\":919,\"item_name\":\"NIKE DUNK HIGH WARMTH 男子运动鞋\",\"store_id\":82,\"store_name\":\"Nike\",\"list_price\":999.0,\"image_url\":\"/uploads/item_image/201412180400061418889606785_302w.jpg\",\"image_width\":302,\"image_height\":302,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"越秀区\",\"presentShowUp\":4,\"price\":599.0,\"brand\":\"New Balance\",\"mall\":\"名盛广场\",\"business_region\":\"北京路步行街商圈\",\"views_count\":1,\"item_id\":765,\"item_name\":\"NewBalanceNB 男鞋 轻量跑步鞋 运动鞋 休闲鞋\",\"store_id\":78,\"store_name\":\"New Balance\",\"list_price\":699.0,\"image_url\":\"/uploads/item_image/201412181010151418868615655_302w.png\",\"image_width\":302,\"image_height\":265,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":160,\"price\":999.0,\"brand\":\"SELECTED\",\"mall\":\"太阳新天地购物中心\",\"business_region\":\"珠江新城商圈\",\"views_count\":0,\"item_id\":708,\"item_name\":\"时尚拼接色商务休闲款高帮皮鞋\",\"store_id\":76,\"store_name\":\"SELECTED\",\"list_price\":1199.0,\"image_url\":\"/uploads/item_image/201412150354021418630042153_302w.jpg\",\"image_width\":302,\"image_height\":483,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"越秀区\",\"presentShowUp\":4,\"price\":399.0,\"brand\":\"Esprit\",\"mall\":\"王府井百货\",\"business_region\":\"农林下路商圈\",\"views_count\":1,\"item_id\":522,\"item_name\":\"简约百搭款衬衫\",\"store_id\":71,\"store_name\":\"ESPRIT\",\"list_price\":599.0,\"image_url\":\"/uploads/item_image/201412120450271418374227514_302w.jpg\",\"image_width\":302,\"image_height\":457,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":19,\"price\":118.0,\"business_region\":\"珠江新城商圈\",\"views_count\":0,\"item_id\":395,\"item_name\":\"THE ONE拼色运动裤韩版修身卫裤潮男小脚锥形哈伦裤\",\"store_id\":59,\"store_name\":\"THE ONE\",\"list_price\":188.0,\"image_url\":\"/uploads/item_image/201412090221041418106064575_302w.jpg\",\"image_width\":302,\"image_height\":459,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false}],\"page\":3,\"total_count\":243},\"tag\":\"\"}";
		String str2 = "{\"code\":200,\"msg\":\"请求成功\",\"result\":{\"count\":8,\"items\":[{\"description\":\"90年代复古代表鞋款，明星款五系列的新品型号。标志性的鞋舌，刺绣大N字logo，个性与复古。\",\"district\":\"越秀区\",\"presentShowUp\":4,\"price\":699.0,\"brand\":\"New Balance\",\"mall\":\"名盛广场\",\"business_region\":\"北京路步行街商圈\",\"views_count\":4,\"item_id\":763,\"item_name\":\"NewBalanceNB 男鞋 经典复古鞋 跑步鞋\",\"store_id\":78,\"store_name\":\"New Balance\",\"list_price\":799.0,\"image_url\":\"/uploads/item_image/201412181007131418868433235_302w.png\",\"image_width\":302,\"image_height\":279,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":117,\"price\":599.0,\"brand\":\"SELECTED\",\"mall\":\"太阳新天地购物中心\",\"business_region\":\"珠江新城商圈\",\"views_count\":0,\"item_id\":700,\"item_name\":\"色织细格纹面料修身剪裁休闲裤\",\"store_id\":76,\"store_name\":\"SELECTED\",\"list_price\":639.0,\"image_url\":\"/uploads/item_image/201412150343081418629388076_302w.jpg\",\"image_width\":250,\"image_height\":400,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":143,\"price\":1399.0,\"mall\":\"天河城\",\"business_region\":\"天河体育中心商圈\",\"views_count\":0,\"item_id\":723,\"item_name\":\"跑步 男子 boost跑步鞋 一号黑\",\"store_id\":77,\"store_name\":\"阿迪达斯\",\"list_price\":1499.0,\"image_url\":\"/uploads/item_image/201412170434231418805263781_302w.jpg\",\"image_width\":302,\"image_height\":135,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"海珠区\",\"presentShowUp\":159,\"price\":869.0,\"brand\":\"耐克\",\"mall\":\"万国广场\",\"business_region\":\"江南大道商圈\",\"views_count\":0,\"item_id\":919,\"item_name\":\"NIKE DUNK HIGH WARMTH 男子运动鞋\",\"store_id\":82,\"store_name\":\"Nike\",\"list_price\":999.0,\"image_url\":\"/uploads/item_image/201412180400061418889606785_302w.jpg\",\"image_width\":302,\"image_height\":302,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"越秀区\",\"presentShowUp\":4,\"price\":599.0,\"brand\":\"New Balance\",\"mall\":\"名盛广场\",\"business_region\":\"北京路步行街商圈\",\"views_count\":1,\"item_id\":765,\"item_name\":\"NewBalanceNB 男鞋 轻量跑步鞋 运动鞋 休闲鞋\",\"store_id\":78,\"store_name\":\"New Balance\",\"list_price\":699.0,\"image_url\":\"/uploads/item_image/201412181010151418868615655_302w.png\",\"image_width\":302,\"image_height\":265,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":160,\"price\":999.0,\"brand\":\"SELECTED\",\"mall\":\"太阳新天地购物中心\",\"business_region\":\"珠江新城商圈\",\"views_count\":0,\"item_id\":708,\"item_name\":\"时尚拼接色商务休闲款高帮皮鞋\",\"store_id\":76,\"store_name\":\"SELECTED\",\"list_price\":1199.0,\"image_url\":\"/uploads/item_image/201412150354021418630042153_302w.jpg\",\"image_width\":302,\"image_height\":483,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":19,\"price\":118.0,\"business_region\":\"珠江新城商圈\",\"views_count\":0,\"item_id\":395,\"item_name\":\"THE ONE拼色运动裤韩版修身卫裤潮男小脚锥形哈伦裤\",\"store_id\":59,\"store_name\":\"THE ONE\",\"list_price\":188.0,\"image_url\":\"/uploads/item_image/201412090221041418106064575_302w.jpg\",\"image_width\":302,\"image_height\":459,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"越秀区\",\"presentShowUp\":4,\"price\":399.0,\"brand\":\"Esprit\",\"mall\":\"王府井百货\",\"business_region\":\"农林下路商圈\",\"views_count\":1,\"item_id\":522,\"item_name\":\"简约百搭款衬衫\",\"store_id\":71,\"store_name\":\"ESPRIT\",\"list_price\":599.0,\"image_url\":\"/uploads/item_image/201412120450271418374227514_302w.jpg\",\"image_width\":302,\"image_height\":457,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false}],\"page\":3,\"total_count\":243},\"tag\":\"\"}";
		CRC32 crc = new CRC32();
		crc.update(str.getBytes());
		String token = "w/\"" + crc.getValue() + "\"";
		System.out.println(token);
		System.out.println(Integer.toHexString(Arrays.hashCode(str.getBytes())));
		System.out.println(MD5.digest(str).toString());
		System.out.println(MD5.digest(str2));
		crc.update(str2.getBytes());
		String token2 = "w/\"" + crc.getValue() + "\"";
		System.out.println(token2);
//		Integer.toHexString(Arrays.hashCode(str.getBytes()));
    }
    
    public void testDigest() throws NoSuchAlgorithmException, UnsupportedEncodingException{
    	String str = "{\"code\":200,\"msg\":\"请求成功\",\"result\":{\"count\":8,\"items\":[{\"description\":\"90年代复古代表鞋款，明星款五系列的新品型号。标志性的鞋舌，刺绣大N字logo，个性与复古。\",\"district\":\"越秀区\",\"presentShowUp\":4,\"price\":699.0,\"brand\":\"New Balance\",\"mall\":\"名盛广场\",\"business_region\":\"北京路步行街商圈\",\"views_count\":4,\"item_id\":763,\"item_name\":\"NewBalanceNB 男鞋 经典复古鞋 跑步鞋\",\"store_id\":78,\"store_name\":\"New Balance\",\"list_price\":799.0,\"image_url\":\"/uploads/item_image/201412181007131418868433235_302w.png\",\"image_width\":302,\"image_height\":279,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":117,\"price\":599.0,\"brand\":\"SELECTED\",\"mall\":\"太阳新天地购物中心\",\"business_region\":\"珠江新城商圈\",\"views_count\":0,\"item_id\":700,\"item_name\":\"色织细格纹面料修身剪裁休闲裤\",\"store_id\":76,\"store_name\":\"SELECTED\",\"list_price\":639.0,\"image_url\":\"/uploads/item_image/201412150343081418629388076_302w.jpg\",\"image_width\":250,\"image_height\":400,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":143,\"price\":1399.0,\"mall\":\"天河城\",\"business_region\":\"天河体育中心商圈\",\"views_count\":0,\"item_id\":723,\"item_name\":\"跑步 男子 boost跑步鞋 一号黑\",\"store_id\":77,\"store_name\":\"阿迪达斯\",\"list_price\":1499.0,\"image_url\":\"/uploads/item_image/201412170434231418805263781_302w.jpg\",\"image_width\":302,\"image_height\":135,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"海珠区\",\"presentShowUp\":159,\"price\":869.0,\"brand\":\"耐克\",\"mall\":\"万国广场\",\"business_region\":\"江南大道商圈\",\"views_count\":0,\"item_id\":919,\"item_name\":\"NIKE DUNK HIGH WARMTH 男子运动鞋\",\"store_id\":82,\"store_name\":\"Nike\",\"list_price\":999.0,\"image_url\":\"/uploads/item_image/201412180400061418889606785_302w.jpg\",\"image_width\":302,\"image_height\":302,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"越秀区\",\"presentShowUp\":4,\"price\":599.0,\"brand\":\"New Balance\",\"mall\":\"名盛广场\",\"business_region\":\"北京路步行街商圈\",\"views_count\":1,\"item_id\":765,\"item_name\":\"NewBalanceNB 男鞋 轻量跑步鞋 运动鞋 休闲鞋\",\"store_id\":78,\"store_name\":\"New Balance\",\"list_price\":699.0,\"image_url\":\"/uploads/item_image/201412181010151418868615655_302w.png\",\"image_width\":302,\"image_height\":265,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":160,\"price\":999.0,\"brand\":\"SELECTED\",\"mall\":\"太阳新天地购物中心\",\"business_region\":\"珠江新城商圈\",\"views_count\":0,\"item_id\":708,\"item_name\":\"时尚拼接色商务休闲款高帮皮鞋\",\"store_id\":76,\"store_name\":\"SELECTED\",\"list_price\":1199.0,\"image_url\":\"/uploads/item_image/201412150354021418630042153_302w.jpg\",\"image_width\":302,\"image_height\":483,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"越秀区\",\"presentShowUp\":4,\"price\":399.0,\"brand\":\"Esprit\",\"mall\":\"王府井百货\",\"business_region\":\"农林下路商圈\",\"views_count\":1,\"item_id\":522,\"item_name\":\"简约百搭款衬衫\",\"store_id\":71,\"store_name\":\"ESPRIT\",\"list_price\":599.0,\"image_url\":\"/uploads/item_image/201412120450271418374227514_302w.jpg\",\"image_width\":302,\"image_height\":457,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":19,\"price\":118.0,\"business_region\":\"珠江新城商圈\",\"views_count\":0,\"item_id\":395,\"item_name\":\"THE ONE拼色运动裤韩版修身卫裤潮男小脚锥形哈伦裤\",\"store_id\":59,\"store_name\":\"THE ONE\",\"list_price\":188.0,\"image_url\":\"/uploads/item_image/201412090221041418106064575_302w.jpg\",\"image_width\":302,\"image_height\":459,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false}],\"page\":3,\"total_count\":243},\"tag\":\"\"}";
		String str2 = "{\"code\":200,\"msg\":\"请求成功\",\"result\":{\"count\":8,\"items\":[{\"description\":\"90年代复古代表鞋款，明星款五系列的新品型号。标志性的鞋舌，刺绣大N字logo，个性与复古。\",\"district\":\"越秀区\",\"presentShowUp\":4,\"price\":699.0,\"brand\":\"New Balance\",\"mall\":\"名盛广场\",\"business_region\":\"北京路步行街商圈\",\"views_count\":4,\"item_id\":763,\"item_name\":\"NewBalanceNB 男鞋 经典复古鞋 跑步鞋\",\"store_id\":78,\"store_name\":\"New Balance\",\"list_price\":799.0,\"image_url\":\"/uploads/item_image/201412181007131418868433235_302w.png\",\"image_width\":302,\"image_height\":279,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":117,\"price\":599.0,\"brand\":\"SELECTED\",\"mall\":\"太阳新天地购物中心\",\"business_region\":\"珠江新城商圈\",\"views_count\":0,\"item_id\":700,\"item_name\":\"色织细格纹面料修身剪裁休闲裤\",\"store_id\":76,\"store_name\":\"SELECTED\",\"list_price\":639.0,\"image_url\":\"/uploads/item_image/201412150343081418629388076_302w.jpg\",\"image_width\":250,\"image_height\":400,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":143,\"price\":1399.0,\"mall\":\"天河城\",\"business_region\":\"天河体育中心商圈\",\"views_count\":0,\"item_id\":723,\"item_name\":\"跑步 男子 boost跑步鞋 一号黑\",\"store_id\":77,\"store_name\":\"阿迪达斯\",\"list_price\":1499.0,\"image_url\":\"/uploads/item_image/201412170434231418805263781_302w.jpg\",\"image_width\":302,\"image_height\":135,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"海珠区\",\"presentShowUp\":159,\"price\":869.0,\"brand\":\"耐克\",\"mall\":\"万国广场\",\"business_region\":\"江南大道商圈\",\"views_count\":0,\"item_id\":919,\"item_name\":\"NIKE DUNK HIGH WARMTH 男子运动鞋\",\"store_id\":82,\"store_name\":\"Nike\",\"list_price\":999.0,\"image_url\":\"/uploads/item_image/201412180400061418889606785_302w.jpg\",\"image_width\":302,\"image_height\":302,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"越秀区\",\"presentShowUp\":4,\"price\":599.0,\"brand\":\"New Balance\",\"mall\":\"名盛广场\",\"business_region\":\"北京路步行街商圈\",\"views_count\":1,\"item_id\":765,\"item_name\":\"NewBalanceNB 男鞋 轻量跑步鞋 运动鞋 休闲鞋\",\"store_id\":78,\"store_name\":\"New Balance\",\"list_price\":699.0,\"image_url\":\"/uploads/item_image/201412181010151418868615655_302w.png\",\"image_width\":302,\"image_height\":265,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":160,\"price\":999.0,\"brand\":\"SELECTED\",\"mall\":\"太阳新天地购物中心\",\"business_region\":\"珠江新城商圈\",\"views_count\":0,\"item_id\":708,\"item_name\":\"时尚拼接色商务休闲款高帮皮鞋\",\"store_id\":76,\"store_name\":\"SELECTED\",\"list_price\":1199.0,\"image_url\":\"/uploads/item_image/201412150354021418630042153_302w.jpg\",\"image_width\":302,\"image_height\":483,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"天河区\",\"presentShowUp\":19,\"price\":118.0,\"business_region\":\"珠江新城商圈\",\"views_count\":0,\"item_id\":395,\"item_name\":\"THE ONE拼色运动裤韩版修身卫裤潮男小脚锥形哈伦裤\",\"store_id\":59,\"store_name\":\"THE ONE\",\"list_price\":188.0,\"image_url\":\"/uploads/item_image/201412090221041418106064575_302w.jpg\",\"image_width\":302,\"image_height\":459,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false},{\"description\":\"\",\"district\":\"越秀区\",\"presentShowUp\":4,\"price\":399.0,\"brand\":\"Esprit\",\"mall\":\"王府井百货\",\"business_region\":\"农林下路商圈\",\"views_count\":1,\"item_id\":522,\"item_name\":\"简约百搭款衬衫\",\"store_id\":71,\"store_name\":\"ESPRIT\",\"list_price\":599.0,\"image_url\":\"/uploads/item_image/201412120450271418374227514_302w.jpg\",\"image_width\":302,\"image_height\":457,\"user_liked\":false,\"likes_count\":0,\"is_followed\":false}],\"page\":3,\"total_count\":243},\"tag\":\"\"}";
		
		long start = System.currentTimeMillis();
		MessageDigest digest = MessageDigest.getInstance("MD5");
		for (int i = 0; i < 100000; i++) {
			digest.update(str.getBytes());
		}
		System.out.println(com.mall.test.test01.MD5.bytes2Hex(digest.digest()));
		System.out.println(start - System.currentTimeMillis() + "ms");
		
		start = System.currentTimeMillis();
		digest = MessageDigest.getInstance("sha-1");
//		for (int i = 0; i < 100000; i++) {
			digest.update(str.getBytes("UTF-8"));
//		}
		System.out.println(com.mall.test.test01.MD5.bytes2Hex(digest.digest()));
		try {
			System.out.println(EncodeUtils.string2SHA1(str));
		} catch (UnsupportedEncodingException e) {
		}
		System.out.println(start - System.currentTimeMillis() + "ms");
		
		start = System.currentTimeMillis();
		CRC32 crc = new CRC32();
		for (int i = 0; i < 100000; i++) {
			crc.update(str.getBytes());
		}
		System.out.println(crc.getValue());
		System.out.println(start - System.currentTimeMillis() + "ms");
		
    }
    
    public void testServlet() throws IOException, ClassNotFoundException{
    	String path = UndertowServer.class.getClassLoader().getResource("./").getPath();
    	String pack = UndertowServer.class.getPackage().getName();
    	File file = new File("src/main/java/com/mall/test/test01/undertow");
    	
    	
    	
    	int i = 0;
    	while (i < files.length) {
    		File[] files = file.listFiles();File f = files[i++];
    		if (f.isDirectory()) {
    			
    		} else {
    			Class clazz = Class.forName(pack + "." + f.getName().split("\\.")[0]);
    			if (clazz.getSuperclass() != HttpServlet.class)
        			continue;
        		ServletMappings anno = (ServletMappings) clazz.getAnnotation(ServletMappings.class);
        		String[] mappings = anno.mappings();
        		String name = anno.name();
        		System.out.print(mappings);
        		ServletInfo servlet = Servlets.servlet(name, clazz).addMappings(mappings);
    		}
    		
    	}
    }
    
    public void testPath() throws IOException {
    	String pack = UndertowServer.class.getPackage().getName();
    	String path = "classpath*:" + getFilePath(pack) + "/" + "**/*.class";
    	Enumeration<URL> urls = this.getClass().getClassLoader().getResources(getFilePath(pack));
    	
    	while (urls.hasMoreElements()) {
    		URL url = urls.nextElement();
    		System.out.println(url.getFile());
    		if ("file".equals(url.getProtocol())) {
    			File root = new File(url.getFile());
    			System.out.print(root.getName());
    			File[] list = root.listFiles();
    			System.out.println(Arrays.asList(list).toString());
    		}
    	}
    	
    	System.out.println(getFilePath(pack) + "--" +path);
    	System.out.println(System.getenv().toString());
    }
    
    public void testFilesInJar() throws IOException, ClassNotFoundException {
    	String jarPath = "C:\\Users\\yi.cao\\.m2\\repository\\io\\undertow\\undertow-core\\1.1.1.Final\\undertow-core-1.1.1.Final.jar";
    	JarFile jar = new JarFile(jarPath);
    	Enumeration<JarEntry> entries = jar.entries();
    	
    	while (entries.hasMoreElements()) {
    		JarEntry entry = entries.nextElement();
    		if (entry.isDirectory())
    			continue;
    		String name = entry.getName();
    		/*if (name.endsWith(".class")) {
    			Class cls = Class.forName(name.substring(0, name.length() - 6).replaceAll("/", "\\."));
    			System.out.println(cls.getClass().getName());
    		}*/
    		if (name.matches("io/([a-z/]*)/([a-zA-Z/]*).class$"))
    			System.out.println(entry.getName());
    	}
    }
    
    private String getFilePath(String packageName) {
    	return packageName.replaceAll("\\.", "/");
    }
}
