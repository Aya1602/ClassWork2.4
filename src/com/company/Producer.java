package com.company;

public class Producer implements Runnable{
    private Stock stock;

    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            stock.produceProduct();
        }

    }

    public Producer(Stock stock) {
        this.stock = stock;
    }
}
