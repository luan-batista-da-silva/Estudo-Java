import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> carros = new Stack<>();

        carros.push("BMW - M3");
        carros.push("Golf");
        carros.push("Camaro");
        carros.push("Corvet");
        carros.push("Mercedes-Benz");
        carros.push("Alfa Romeu");

        System.out.println("Topo da Fila: " + carros.peek() + "\n");
            // O .peek() retorna qual é o topo da fila
        System.out.println(carros.pop());
            // O método .pop() retorna o topo da pilha mas retira ele


        for (String carro : carros) {
            System.out.println(carro);
        }

        carros.clear();
            // O método .clear() limpa toda a pilha deixando ela vazia

        System.out.println(carros.empty() ? "\nPilha vazia!" : "\nPilha com Elementos!");

    }
}