package com.amalik18.Homework1.DiningPhilosophers;

public class Philosopher implements Runnable {
    private final int numPhil;
    private final Fork leftFork;
    private final Fork rightFork;

    public Philosopher(int numPhil, Fork leftFork, Fork rightFork) {
        this.numPhil = numPhil;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
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

    }
}
