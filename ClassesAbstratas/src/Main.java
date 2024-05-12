import classes.*;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int painelOptions() {
        Scanner sc = new Scanner(System.in);

        System.out.println("+------------------------------------------------+");
        System.out.println("| 0 - Finalizar Programa                         |");
        System.out.println("| 1 - Criar Animal                               |");
        System.out.println("| 2 - Mover Animal                               |");
        System.out.println("| 3 - Verificar se Animal está Vivo              |");
        System.out.println("| 3 - Informar morte de um Animal                |");
        System.out.println("| 4 - Mostrar Infos                              |");
        System.out.println("+------------------------------------------------+");

        return sc.nextInt();
    }

    public static int painelAnimais (ArrayList<Animal> animais) {

        System.out.println("+----------------------------------------------+");
        for (Animal animal : animais) {
            System.out.printf("%d - %s\n", animal.getCode(), animal.getNome());
        }
        System.out.println("+----------------------------------------------+");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEscolha um animal pelo seu codigo: ");

        int codeEscolhido = sc.nextInt();

        for (Animal animal : animais) {
            if (animal.getCode() == codeEscolhido) {
                return animais.indexOf(animal);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int res = 1;
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<Animal>();

        while (res != 0) {
            res = painelOptions();

            int sexo;
            int tipoAlimentacao;
            int posAnimalEscolhido;

            switch (res) {
                case 0:
                    System.out.println("OBRIGADO POR UTILIZAR O PROGRAMA!!!");
                    System.out.println("+------------------------------------------------+");
                    break;
                case 1:
                    System.out.println("Digite o nome do animal: ");
                    String nome = sc.nextLine();
                    System.out.println("+------------------------------------------------+");

                    while (true) {
                        System.out.println("Digite o sexo do animal (1 - MACHO ou 2 - FEMEA): ");
                        sexo = sc.nextInt();
                        sc.nextLine();

                        if (sexo == 1) {
                            break;
                        }
                        else if (sexo == 2) {
                            break;
                        }
                        else {
                            System.out.println("[ERROR] Opção Inválida! Digite um sexo adequado.");
                            continue;
                        }
                    }
                    System.out.println("+------------------------------------------------+");

                    System.out.println("Digite o local que o animal vive: ");
                    String localEncontrado = sc.nextLine();
                    System.out.println("+------------------------------------------------+");

                    while (true) {
                        System.out.println("Digite o tipo de alimentação do animal (1 - HERBÍVORO ou 2 - CARNÍVORO): ");
                        tipoAlimentacao = sc.nextInt();
                        sc.nextLine();

                        if (tipoAlimentacao == 1) {
                            break;
                        }
                        else if (tipoAlimentacao == 2) {
                            break;
                        }
                        else {
                            System.out.println("[ERROR] Opção Inválida! Digite um um tipo de alimentação adequada.\n");
                            continue;
                        }
                    }
                    System.out.println("+------------------------------------------------+");

                    System.out.println("Digite a qual família o animal pertence: ");
                    String familia = sc.nextLine();
                    System.out.println("+------------------------------------------------+\n");

                    Especie especie = new Especie(nome, sexo, localEncontrado, tipoAlimentacao, familia);

                    animals.add(especie);
                    break;
                case 2:
                    System.out.println("\nQual animal deseja movimentar?");
                    posAnimalEscolhido = painelAnimais(animals);

                    if (posAnimalEscolhido == -1) {
                        System.out.println("Esse animal não foi criado!\n");
                    }
                    else {
                        System.out.println("Quantos metros o animal vai ser mover? (Parte fracionária separada por ponto \".\") ");
                        float distMetros =  sc.nextFloat();
                        System.out.printf("O animal %s andou %.2f metros!\n\n", animals.get(posAnimalEscolhido).getNome(), distMetros);
                    }
                    break;

                case 3:
                    System.out.println("\nQual animal deseja veririficar se está vivo?");
                    posAnimalEscolhido = painelAnimais(animals);

                    if (posAnimalEscolhido == -1) {
                        System.out.println("Esse animal não foi criado!\n");
                    }
                    else {
                       System.out.printf("O animal %s está %s!\n\n", animals.get(posAnimalEscolhido).getNome(), animals.get(posAnimalEscolhido).isVivo() ? "VIVO" : "MORTO");
                    }
                    break;
                case 4:
                    System.out.println("\nQual animal deseja cadastrar como morto?");
                    posAnimalEscolhido = painelAnimais(animals);

                    if (posAnimalEscolhido == -1) {
                        System.out.println("Esse animal não foi criado!\n");
                    }
                    else {
                        System.out.printf("Lamentamos a perda do(a) %s!\n\n", animals.get(posAnimalEscolhido).getNome());
                    }
                    break;
                default:
                    System.out.println("Insira uma opção válida!");
                    System.out.println("+------------------------------------------------+\n");
                    break;
            }

        }





    }
}