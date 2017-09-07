package com.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {

    // ����Ʊ
    private int tickets = 100;

    // ����������
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
    	boolean back=true;
        while (back) {
            try {
                // ����
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()
                            + "���ڳ��۵�" + (tickets--) + "��Ʊ");
                }else{
                	back=false;
                }
            } finally {
                // �ͷ���
                lock.unlock();
            }
        }
    }

}
