package com.mall.test.test01.schedule;

import java.util.concurrent.ConcurrentLinkedQueue;

public class SessionManager {
	
	private ConcurrentLinkedQueue<Session> sessions;
	
	public Session newSession(){
		Session session = new Session();
		session.setExpireTime(20 * 60 * 1000);
		session.setMaxIdleTime(20 * 60 * 1000);
		session.setSessionId(getRandomAlpha(16));
		session.setActive(true);
		session.put("info", "my first session");
		return session;
	}
	
	public String getRandomAlpha(Integer length) {
		if(length == null)
			length = 3;
		StringBuilder resStr = new StringBuilder(length);
		for(int i=0; i<length; i++) {
			int ranType = (int)Math.round(Math.random());
			if(ranType == 0) {			//小写
				resStr.append((char)(Math.random() * 26 + 'a'));
			}else if(ranType == 1) {	//大写
				resStr.append((char)(Math.random() * 26 + 'A'));
			}
		}
		return resStr.toString();
	}
}
