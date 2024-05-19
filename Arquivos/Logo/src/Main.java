import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path imgNova = Paths.get("/home/luan/Estudo-Java/Arquivos/Logo/imagem-nova.jpeg");
        Path imgAntiga = Paths.get("/home/luan/Estudo-Java/Arquivos/Logo/imagem-antiga.jpeg");

        try {
            byte[] bytesImgNova = Files.readAllBytes(imgNova);
            Files.write(imgAntiga, bytesImgNova);
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
    }
}