package com.amalik18.Homework1.ProducerConsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private final BlockingQueue<Data> queue;

    public Producer(BlockingQueue<Data> queue) {
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
        // produce message
        for (int i=0; i < 100; i++) {
            Data message = new Data("" + i);
            try {
                Thread.sleep(i);
                queue.put(message);
                System.out.println("Produce " + message.getData());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Adding final exit message
        Data message = new Data("Exit");
        try {
            queue.put(message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}