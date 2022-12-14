package br.com.treinamento.model;

public class MultiThreadThing extends Thread {

    private int threadNumber;

    public MultiThreadThing(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("THREAD - " + i + " from thread number: " + threadNumber);

            if (threadNumber == 3) {
                throw new RuntimeException("THREAD - threadNumber 3 não pode processar");
            }

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
