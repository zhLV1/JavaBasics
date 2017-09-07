package com.lock;

public class TestLock implements Runnable{

	private String name;
	public TestLock(String name){
		super();
		this.name=name;
	}
	
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("threadName:"+name+" --"+i);
		}
		
	}

}