public class classes01 {
    public static void main(String[] args) {
        Player p1 = new Player(1);
            /*
            Esse é o processo de instanciação de um objeto de uma determinada classe
            NEW -> É o operador responsável que aloca um espasso na memória HEAP
            para armazenar o objeto na memória
            */ 
        Player p2 = new Player(2);
        Player p3 = new Player(3);
            // Esses três objetos são independentes portanto não têm relação direta entre si
    }
}
