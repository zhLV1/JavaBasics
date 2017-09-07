package com.lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Ticket {

	private int tickets = 100;
	private ReadWriteLock rwl = new ReentrantReadWriteLock();   
	public void getTickets() {
		rwl.readLock().lock();// 取到写锁  
        try {  
            System.out.println(Thread.currentThread().getName() + "准备查看票数");  
            try {  
                Thread.sleep(20);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
         
            System.out.println(Thread.currentThread().getName() + "查看剩余：" + this.tickets);  
        } finally {  
            rwl.readLock().unlock();// 释放写锁  
        }  
		
	}

	public void setTickets() {
		
		rwl.writeLock().lock();// 取到读锁  
        try {  
            System.out.println(Thread.currentThread().getName() + "准备买票数");  
            try {  
                Thread.sleep(20);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
            this.tickets--;
            System.out.println(Thread.currentThread().getName() + "买的票号：" + this.tickets);  
        } finally {  
            rwl.writeLock().unlock();// 释放读锁  
        }  
	}
	
}
