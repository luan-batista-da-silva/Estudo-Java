public class loops {
    public static void main(String[] args) {
        System.out.println("USANDO O FOR:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("i = %d\t", i);
        }
        System.out.println("");
        System.out.println("USANDO O WHILE:");
        
        int j = 0;
        
        while (j < 10) {
            System.out.printf("j = %d\t", j);
            j++;
        }

        System.out.println("");
        System.out.println("USANDO O DO-WHILE:");
        
        int k = 0;
        do {
            System.out.printf("k = %d\t", k);
            k++; 
        } while (k < 10);
        
        System.out.println("");
        System.out.println("Fim do Progrma!");
    }
}
