package com;

public class ThreadTest extends Thread {   
    private int threadNo;   
    private String lock="lock";
    public ThreadTest(int threadNo) {   
        this.threadNo = threadNo;   
    }   
    public static void main(String[] args) throws Exception {   
        for (int i = 1; i < 10; i++) {   
           new ThreadTest(i).start();   
            Thread.sleep(1);   
        }   
     }   
    
    @Override  
     public  void run() {   
    	synchronized(lock){
    		for (int i = 1; i < 100; i++) {   
                System.out.println("No." + threadNo + ":" + i);   
            }  
    	}
         
     }   
 }   