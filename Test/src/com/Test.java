package com;

import com.lock.SellTicket;
import com.thread.MyTread;
import com.thread.Myrunable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("线程开始");
		MyTread my=new MyTread();
		//启动方式不同
		Myrunable runable=new Myrunable();
		Thread thread=new Thread(runable);
		SellTicket  lock=new SellTicket();
		Thread threadLock1=new Thread(lock);
		Thread threadLock=new Thread(lock);
		Thread threadLock2=new Thread(lock);
		Thread threadLock3=new Thread(lock);
		Thread threadLock4=new Thread(lock);
//		thread.start();
//		my.start();
		threadLock.start();
		threadLock1.start();
		threadLock2.start();
		threadLock3.start();
		threadLock4.start();
	}

}
