package com.amalik18.Homework1.ProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class PCService {
    public static void main(String[] args) {
        // Create Queue of size 15
        BlockingQueue<Data> sharedBuffer = new ArrayBlockingQueue<>(15);

        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);

        // Start producer
        new Thread(producer).start();

        // start consumer
        new Thread(consumer).start();

        System.out.println("Producer and Consumer have started.....");
    }
}

