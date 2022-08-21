import br.com.treinamento.model.MultiThreadRunnable;
import br.com.treinamento.model.MultiThreadThing;

public class App {
    public static void main(String[] args) throws InterruptedException {

        // Tenho que usar o start pra rodar as threads em paralelo, se usar o run, fica na sequência
        // Executando com o Thread (extends)
        for (int i = 0; i < 5; i++) {
            MultiThreadThing multiThreadThing = new MultiThreadThing(i);
            multiThreadThing.start();
        }

        // Executando com o Runnable (implements), vantagem que ele implementa e fico liberado pra extender outra classe que quiser
        for (int i = 0; i < 5; i++) {
            MultiThreadRunnable multiThreadRunnable = new MultiThreadRunnable(i);
            Thread myThread = new Thread(multiThreadRunnable);
            myThread.start();
            System.out.println(myThread.isAlive()); // true - verifica se a thread ainda tá em execução
            // Executa na sequência este conjunto
            myThread.join();
            System.out.println(myThread.isAlive()); // false - verifica se a thread ainda tá em execução

        }
    }
}
