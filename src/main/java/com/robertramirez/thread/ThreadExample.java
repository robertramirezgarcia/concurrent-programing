package com.robertramirez.thread;

public class ThreadExample implements Runnable{
    public static void main(String[] args) {
        //This example is for demonstrate the concurrent programming with Runnable interface
        ThreadExample t = new ThreadExample();
        Thread hilo = new Thread(t);
        hilo.start();
    }

    @Override
    public void run() {
        int total = 0;
        for(int i = 0; i < 5; i++){
            total += i;
            try{
                Thread.sleep(300);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(total);
    }
}
