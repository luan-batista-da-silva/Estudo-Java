import java.security.SecureRandom; // Para gerar números aletórios

public class matriz {
    public static void main(String[] args) {
        final int LINHAS = 3;
        final int COLUNAS = 5;

        int[][] mat_num = new int[LINHAS][COLUNAS];

        System.out.println("Gerando os números e printando!");

        for (int l = 0; l < LINHAS; l++) {
            System.out.printf("|");
            for (int c = 0; c < COLUNAS; c++) {
                mat_num[l][c] = new SecureRandom().nextInt(1000);
                System.out.printf(" %3d |", mat_num[l][c]);
            }
            System.out.println("");
        }

        System.out.println("Printando usando a Segunda forma de Loop!");


        for(int[] n:mat_num) {
            System.out.printf("|");
            for (int v:n) {
                System.out.printf(" %3d |", v);
            }
            System.out.println("");
        }


    }
}