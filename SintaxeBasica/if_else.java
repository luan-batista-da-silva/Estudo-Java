public class if_else {
    public static void main(String[] args) {
        int nota = 45;
        int media = 60;

        /*
            Os operadores de operação são exatamente iguais aos do C
                &&, ||, >, <, >=, <=, == 
        */

        String res;

        res = (nota >= media ? "Aprovado" : "Reprovado");
            // Operação ternária

/*
    if (nota >= media) {
            System.out.println("Aprovado");
        }
        else if (nota >= 40) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
        */
        
        System.out.printf("%s\n",res);
        
        int pos = 7;

        switch (pos) {
            case 1:
                System.out.println("Primeiro Lugar!");
                break;
            case 2:
                System.out.println("Segundo Lugar!");
                break;
            case 3:
                System.out.println("Terceiro Lugar!");
                break;
            case 4: case 5: case 6:
                System.out.println("Ganhou prêmio de participação!");
                break;
            default:
                System.out.println("Não subiu ao pódio!\nE não ganhou prêmio de participação!");
                break;
        }

        
        System.out.println("FIM DO PROGRAMA!"); 
    }
}
