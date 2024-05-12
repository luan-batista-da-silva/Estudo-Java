public class metodos {
    public static void main(String[] args) {
        int res = 0;

        res = soma(1, 10, 1216, 48);

        System.out.println(res);
        
    }

    // O método main é Static então os outros métodos da class também têm que ser static

    public static void msg(String m, int l) {
        
        for (int i = 0; i < l; i++) {
            System.out.println(m);
        }
        
    }

    public static int soma2(int n1, int n2) {
        return n1 + n2;
    }

    public static int soma(int... numeros) {
        /* 
            Dessa forma é como se estivesse acontecendo uma passagem de array,
            porém é uma passagem indireta, podendo ter mais de uma argumento para o mesmo método,
            mesmo que este não esteja especificado
        */ 
        int res = 0;

        for (int n:numeros) {
            res += n;
        }

        return res;
    }

    public static double soma(double... numeros) { //Essa propriedade é chamada de SOBRECARGA que é quando métodos com o mesmo nome têm argumentos diferentes
        double res = 0;

        for (double n:numeros) {
            res += n;
        }

        return res;
    }
}