package com.test02;

public class Counter {
	public volatile static int count = 0;
	 
    public static void inc() {
 
        
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
 
        count++;
    }
    public static void main(String[] args) {
    	 
    	//同时启动1000个线程，
 
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Counter.inc();
                }
            }).start();
        }
 
        
        System.out.println("运行结果:Counter.count=" + Counter.count);
    }

}
