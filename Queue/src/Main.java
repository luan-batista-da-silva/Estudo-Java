import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> carros = new LinkedList<>();

        carros.add("BMW - M3");
        carros.add("Golf");
        carros.add("Camaro");
        carros.add("Corvet");
        carros.add("Mercedes-Benz");
        carros.add("Alfa Romeu");

        System.out.println("Cabeça da Fila: " + carros.peek() + "\n");
            // O .peek() retorna qual é o elemento na cabeça da fila
        System.out.println(carros.poll());
            // O método .pop() retorna e imprime o elemento da cabeça da fila mas o retira

        for (String carro : carros) {
            System.out.printf("| %s | " , carro);
        }

        System.out.println(carros.isEmpty() ? "\nPilha vazia!" : "\nPilha com Elementos!");
            // O método para verificar se a fila está vazia é o isEmpty()
    }
}