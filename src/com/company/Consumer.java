package com.company;

public class Consumer implements Runnable{
    private Stock stock;

    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            stock.realizationProduct();
        }
    }

    public Consumer(Stock stock) {
        this.stock = stock;
    }
}
