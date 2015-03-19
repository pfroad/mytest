package com.mall.test.test01.schedule;

import java.util.HashMap;
import java.util.Timer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

@SuppressWarnings("serial")
public class Session<K, V> extends HashMap<K, V>{
	private String SessionId;
	private long expireTime;
	private long maxIdleTime;
	private boolean isActive = false;
	private long latestActiveTime;
	
	public Session() {
		super();
		
		System.out.println(Thread.currentThread().getName() + " is create this object!");
	}
	public String getSessionId() {
		return SessionId;
	}
	public void setSessionId(String sessionId) {
		SessionId = sessionId;
	}
	public long getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(long expireTime) {
		this.expireTime = expireTime;
	}
	public long getMaxIdleTime() {
		return maxIdleTime;
	}
	public void setMaxIdleTime(long maxIdleTime) {
		ScheduledExecutorService exec = new ScheduledThreadPoolExecutor(1);
		Timer timer = new Timer();
//		exec.scheduleAtFixedRate(command, initialDelay, period, unit)
		this.maxIdleTime = maxIdleTime;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public long getLatestActiveTime() {
		return latestActiveTime;
	}
	public void setLatestActiveTime(long latestActiveTime) {
		this.latestActiveTime = latestActiveTime;
	}
	
}
