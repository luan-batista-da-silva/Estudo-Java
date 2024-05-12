import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num[] = {9,5,8,4,7,2,6,3,1,0};
        int num2[] = new int[10];
        int cp[] = new int[num.length];

        Arrays.sort(num);
            // O sort é o método de ordenação de arrays, que pode ser utilizado de diversas formas e com diversos tipos
        Arrays.fill(num2,0);
            // Esse método faz o preenchimento do Array com o valor indicado.
        System.arraycopy(num,0, cp,0,num.length);
            // Esse método faz a cópia de um array para o outro
        Arrays.equals(num2,num);
            // Esse método retorna se o primeiro array é igual ao segundo, todos os elementos um a um, ou seja, para ser iguais devem estar organizados da mesma forma
        Arrays.binarySearch(num,0);
            // É a busca binária do array, se ele encontrar o elemento ele retorna a posição deste em caso contrário retorno -1. O ARRAY PRECISA ESTÁ ORDENADO

    }
}