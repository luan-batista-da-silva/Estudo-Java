import java.util.Scanner;

public class public_private {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int count = 0;
        int life = 1;

        Player p1 = new Player(++count);
        System.out.printf("Digite a vida do Jogador: ");
        life = scan.nextInt();
        p1.setLife(life);
        
        Player p2 = new Player(++count);
        System.out.printf("Digite a vida do Jogador: ");
        life = scan.nextInt();
        p2.setLife(life);
        


        System.out.println("\nPRINTANDO JOGADORES\n");
        System.out.printf("JOGADOR: %d\nVida: %d\n\n", p1.getNum(), p1.getLife());
        System.out.printf("JOGADOR: %d\nVida: %d", p2.getNum(), p2.getLife());
    }    
}
