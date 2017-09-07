package com.lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Ticket {

	private int tickets = 100;
	private ReadWriteLock rwl = new ReentrantReadWriteLock();   
	public void getTickets() {
		rwl.readLock().lock();// ȡ��д��  
        try {  
            System.out.println(Thread.currentThread().getName() + "׼���鿴Ʊ��");  
            try {  
                Thread.sleep(20);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
         
            System.out.println(Thread.currentThread().getName() + "�鿴ʣ�ࣺ" + this.tickets);  
        } finally {  
            rwl.readLock().unlock();// �ͷ�д��  
        }  
		
	}

	public void setTickets() {
		
		rwl.writeLock().lock();// ȡ������  
        try {  
            System.out.println(Thread.currentThread().getName() + "׼����Ʊ��");  
            try {  
                Thread.sleep(20);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
            this.tickets--;
            System.out.println(Thread.currentThread().getName() + "���Ʊ�ţ�" + this.tickets);  
        } finally {  
            rwl.writeLock().unlock();// �ͷŶ���  
        }  
	}
	
}
