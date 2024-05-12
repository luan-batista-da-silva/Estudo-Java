import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, res = 0;
        final int MEDIA = 6;
            // A palavra "final" antes da declaração da variável indica que ela é uma CONSTANTE
        String nome = "";


        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();
        System.out.print("Digite a nota 1: ");
        n1 = scan.nextInt();
        System.out.print("Digite a nota 2: ");
        n2 = scan.nextInt();
        System.out.print("Digite a nota 3: ");
        n3 = scan.nextInt();
        System.out.print("Digite a nota 4: ");
        n4 = scan.nextInt();

        res = n1 + n2 + n3 + n4 / 4;
        
        System.out.println("");

        if (res >= MEDIA) {
            System.out.printf("%s foi APROVADO!", nome);
        }
        else if (res >= 4) {
            System.out.printf("%s está de RECUPERAÇÃO!", nome);
        }
        else {
            System.out.printf("%s foi REPROVADO", nome);
        }
    }
}
