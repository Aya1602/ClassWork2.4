package com.company;

public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock();
        Producer producer = new Producer(stock);
        Consumer consumer = new Consumer(stock);
        new Thread(producer).start();
        new Thread(consumer).start();
        // Thread th = new Thread(producer); th.start;
        // Thread thr = new Thread(consumer); thr.start;

    }
}
