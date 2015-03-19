package com.mall.test.test01.schedule;

public class SessionTest {
	
	private final static ThreadLocal threadSession = new ThreadLocal();
	
	public static Session getSession() {
		Session s = (Session) threadSession.get();
		if (s == null) {
			s = new Session();
			threadSession.set(s);
		}
		return s;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Runnable r = new Runnable() {

				@Override
				public void run() {
					SessionTest.getSession();
				}
				
			};
			
			Thread t = new Thread(r);
			t.setName("t" + i);
			t.start();
		}
	}
}
