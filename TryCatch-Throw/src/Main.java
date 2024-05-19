public class Main {
    public static void main(String[] args) {

        int[] nuns = new int[10];

        for (int i = 0; i < 10; i++) {
            nuns[i] = ++i;
        }

        int nota1 = 52;
        int nota2 = 100;

        if (nota1 > 100) {
            throw new IllegalArgumentException("[ERROR] Valor de Nota Inválida!");
        }
        if (nota2 > 100) {
            throw new IllegalArgumentException("[ERROR] Valor de Nota Inválida!");
                // Como o throw o programa para, e emite a mensagem indicada.
        }

        int res;

        res = nota2 + nota1;

        System.out.println(res);



        /*
                try {
            System.out.println(nuns[1]);
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        } finally {
            System.out.println("[FINISH]"); // Ele entrará de qualquer forma no finally, dando erro ou não
        }
        */
    }
}