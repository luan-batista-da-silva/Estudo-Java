import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        // Existe uma forma de criar um array de char
        char[] chars = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < chars.length; i++) {
            System.out.printf("%c\n", chars[i]);
        }
        System.out.println(("PROGRAMA 1 FINALIZADO!"));

        System.out.println("");

        int[] num = {10, 20, 30, 40};
        
        for(int n:num) { // Este é um for especial para LER elementos automaticamente de um array
            System.out.printf("%d ", n);
        }
        
        System.out.println("PROGRAMA 2 FINALIZADO!");
        
        int[] numeros = {9, 1, 8, 3, 2, 7, 6, 4, 5, 0};

    // Método de ORDENAÇÃO - sort
        Arrays.sort(numeros);

        for(int n:numeros) {
            System.out.printf("%d - ", n);
        }

        System.out.println("");

    // Método para PREENCHIMENTO do Array
        final int TAM = 10;
        int[] dez = new int[TAM];

        Arrays.fill(dez, 10);

        for(int n:dez) {
            System.out.printf("%d ", n);
        }

        System.out.println("");
        
    // Método para COPIAR ARRAYS
        // System.arraycopy(origem, posOrigem, destino, posDestino, tamanho);
        System.arraycopy(numeros, 0, dez, 0, TAM);

        for(int n:dez) {
            System.out.printf("%d ", n);
        }

        System.out.println("");;

        
    // Método para verificar se os array são IGUAIS
        Arrays.equals(numeros, dez);
        System.out.printf("Arrays são iguais? \n%s", Arrays.equals(numeros,dez) ? "Sim" : "Não");
        
        System.out.println("");

    // Método de BUSCA BINÁRIA (Retorna a pos do elemento)
        // Como é uma busca binária, ele precisa vir ordenado.

        int p = 3;
        int pos = Arrays.binarySearch(numeros, p);

        System.out.printf("O elemento %d está no array? \n%s", p,pos >= 0 ? "Sim está no Array" : "Não está no Array");
        
        System.out.println("");
    }

}
