package br.com.questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] estante = new int[4][4];

        int opcao;
        String item;

        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                System.out.printf("Posição [%d][%d]: ", i, j);
                estante[i][j] = ler.nextInt();
            }
        }

        System.out.println("Selecione o número do item: ");
        System.out.println("1: xampu;\n 2: Condicionador;\n 3: Hidratante;\n 4: Tintura;\n 5: Demaquilante;\n 0: Vazio ");
        opcao = ler.nextInt();
        for (int i = 1; i <= 5; i++) {
            switch (opcao) {
                case 1:
                    item = "xampu";
                    break;
                case 2:
                    item = "Condicionador";
                    break;
                case 3:
                    item = "Hidratante";
                    break;
                case 4:
                    item = "Tintura";
                    break;
                case 5:
                    item = "Demaquilante";

                    break;
                case 0:
                    item = null;
                    break;

                default:
                    System.out.println("Item invalido");
                    ;
            }
        }

        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                opcao = estante[i][j];

                if (opcao >= 0 && opcao <= 5) {

                }
            }

        }
    }
}
