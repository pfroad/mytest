package com.mall.test.test01.undertow;

import io.undertow.io.UndertowInputStream;
import io.undertow.server.HttpServerExchange;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import com.google.inject.name.Named;

public class UndertowServer {
	@Named(value = "port")
	private int port;
	@Named(value = "host")
	private String host;
//	private Undertow server;
	
	public static void main(String[] args) throws IllegalArgumentException, IOException {
		getFields();
		/*Xnio xnio = Xnio.getInstance();
		
		int ioThreads = Math.max(Runtime.getRuntime().availableProcessors(), 2);
		int workerThreads = ioThreads * 8;
		XnioWorker worker = xnio.createWorker(OptionMap.builder()
				.set(Options.WORKER_IO_THREADS, ioThreads)
				.set(Options.WORKER_TASK_CORE_THREADS, workerThreads)
				.set(Options.WORKER_TASK_MAX_THREADS, workerThreads)
				.set(Options.TCP_NODELAY, true)
				.getMap());
		
		OptionMap socketOptions = OptionMap.builder()
				.set(Options.WORKER_IO_THREADS, ioThreads)
				.set(Options.TCP_NODELAY, true)
				.set(Options.REUSE_ADDRESSES, true)
				.getMap();
		
		int bufferSize = 16384;
        int buffersPerRegion = 20;
		long maxMemory = Runtime.getRuntime().maxMemory();

		if (maxMemory < 67108864L) {
			bufferSize = 512;
			buffersPerRegion = 10;
		} else if (maxMemory < 134217728L) {
		    bufferSize = 1024;
		    buffersPerRegion = 10;
		}
		
		Pool<ByteBuffer> buffers = new ByteBufferSlicePool(BufferAllocator.DIRECT_BYTE_BUFFER_ALLOCATOR, bufferSize, bufferSize * buffersPerRegion);
		
		if (ListenerType.)*/
		
		/*Undertow server = Undertow.builder()
				.addHttpListener(9010, "127.0.0.1")
				.setHandler(new HttpHandler(){

					@Override
					public void handleRequest(HttpServerExchange exchange)
							throws Exception {
//						final ServletRequestContext servletRequestContext = exchange.getAttachment(ServletRequestContext.ATTACHMENT_KEY);
//				        HttpServletRequest request = (HttpServletRequest) servletRequestContext.getServletRequest();
//				        HttpServletResponse response = (HttpServletResponse) servletRequestContext.getServletResponse();
						readBytesFromExchange(exchange);
				        
						exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
                        exchange.getResponseSender().send("Undertow Test");
					}
					
				}).build();
		
		server.start();
		
		System.in.read();
		System.exit(0);*/
	}
	
	private static void readBytesFromExchange(HttpServerExchange exchange) throws IOException {
    	InputStream inputStream = new UndertowInputStream(exchange);

    	byte[] buffer = new byte[1024];
    	
    	long t1 = System.currentTimeMillis();    	
//    	int readByte = inputStream.read(); 
    	long t2 = System.currentTimeMillis();
    	System.out.println("TIME TO READ FIRST BYTE: " + (t2 - t1) + "ms");
    	
    	t1 = System.currentTimeMillis();
    	while(inputStream.read(buffer) > 0) {
//    		readByte = inputStream.read(buffer);
    		System.out.println(new String(buffer));
    	}	
    	t2 = System.currentTimeMillis();
    	System.out.println("TIME TO READ OTHER BYTES: " + (t2 - t1) + "ms");
    }
	
//	public void init(){
//		server = Undertow.builder()
//				.addHttpListener(port, host)
//				.setHandler(new HttpHandler(){
//
//					@Override
//					public void handleRequest(HttpServerExchange exchange)
//							throws Exception {
//						// TODO Auto-generated method stub
//						
//					}
//					
//				}).build();
//		
//		server.start();
//	}
//	
//	public void destroy(){
//		server.stop();
//	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
	public String getFilePath() {
    	return this.getClass().getPackage().getPackages().toString();
    }
	
	private static List<Field> getFields() {
//		List<Field> fields = new ArrayList<Field>();
		Field[] fields = UndertowServer.class.getDeclaredFields();
		
		for (Field f : fields) {
			System.out.println(f.getName() + ":" + f.getAnnotations().toString());
		}
		
		return Arrays.asList(fields);
	}
}
