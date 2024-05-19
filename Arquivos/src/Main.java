import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Main {
    public static void main(String[] args) { // Pode colocar o "throws IOException"

        Path arquivo = Paths.get("/home/luan/Estudo-Java/Arquivos/texto.tx");


        try {
            List<String> linhas = Files.readAllLines(arquivo);
            linhas.forEach(linha -> System.out.println(linha));
            /*
                for (String linha:linhas) {
                    System.out.println(linha);
                }
            */
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }



    /*
        Path diretorio = Paths.get("/home/luan/Estudo-Java");
        Path arquivo = Paths.get("/home/luan/Estudo-Java/Estudo-Java.iml");


        // Forma de se verificar se é um diretório ou não:
        if (Files.isDirectory(diretorio)) {
            System.out.println("Diretório Existe!");
        }
            System.out.println("Diretório não existe!");        else {

        }

        // Verificando se o arquivo existe
        if (Files.exists(arquivo)) {
            System.out.println("Arquivo Existe!");
        }
        else {
            System.out.println("Arquivo Não Existe!");
        }
     */
    }
}