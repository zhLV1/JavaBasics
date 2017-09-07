package com.thread;

public class MyTread extends Thread {

	public void run(){
		System.out.println("MyTread run"+this.getId());
	} 
}

