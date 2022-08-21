import br.com.treinamento.model.MultiThreadThing;

public class App {
    public static void main(String[] args) {

        // Tenho que usar o start pra rodar as threads em paralelo, se usar o run, fica na sequência
        for (int i = 0; i < 5; i++) {
            MultiThreadThing multiThreadThing = new MultiThreadThing();
            multiThreadThing.start();
        }
    }
}
