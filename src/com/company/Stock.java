package com.company;

public class Stock {
    private int product = 0;

    public synchronized void produceProduct() {
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

        }
        product++;
        System.out.println("Производитель произвел один товар");
        System.out.println("На складе товаров - " + product);
        notify();
    }

    public synchronized void realizationProduct() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        product--;
        System.out.println("Покупатель приобрел один товар");
        System.out.println("На складе товаров - " + product);
        notify();
    }
}
