package br.com.treinamento.model;

import static java.lang.Thread.sleep;

public class MultiThreadRunnable implements Runnable {

    private int threadNumber;

    public MultiThreadRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("RUNNABLE - " + i + " from thread number: " + threadNumber);

            if (threadNumber == 3) {
                throw new RuntimeException("RUNNABLE - threadNumber 3 não pode processar");
            }

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
