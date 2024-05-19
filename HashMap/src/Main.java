import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> carros = new HashMap<Integer, String>();
            // O HashMap integra dois tipos de elementos, uma chave e um elemento

        int key = 0;

        carros.put(key++, "Polo");
        carros.put(key++, "BMW");
        carros.put(key++, "HRV");
        carros.put(key++, "Golf");
        carros.put(key++, "Camaro");
        carros.put(key++, "Mustang");
        carros.put(key++, "Cruze");

        System.out.println(carros);

        carros.clear();
            // Aqui limpa todos os elementos do HashMap

        /*
            for (int i = 0; i < carros.size(); i++) {
                        System.out.println(carros.get(i));
            }
        */

        for (String c: carros.values()) {
            System.out.println(c);
        }




    }
}