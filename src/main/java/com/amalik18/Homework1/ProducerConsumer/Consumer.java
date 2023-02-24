package com.amalik18.Homework1.ProducerConsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<Data> queue;

    public Consumer(BlockingQueue<Data> queue) {
        this.queue = queue;
    }

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        try {
            Data message;
            while((message = queue.take()).getData() != "Exit") {
                Thread.sleep(10);
                System.out.println("Consumed: " + message.getData());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}