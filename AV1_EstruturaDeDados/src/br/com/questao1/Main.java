package br.com.questao1;

import javax.management.QueryEval;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        Queue<String> pq = new PriorityQueue<>();
        Scanner ler = new Scanner(new File("Lista_URL.txt"));
        Scanner lerUrl = new Scanner(System.in);
        while (ler.hasNextLine()) {
            pq.add(ler.nextLine());
        }
        for (int i = 0; i <= pq.toArray().length; i++) {

            System.out.println(pq);

        }

        System.out.print("Digite um link: ");
        String url = lerUrl.nextLine();
        if(pq.contains(url)) {
            pq.remove(url);
            System.out.println("O link " + url + " foi removido!");
        } else {
            System.out.println("Link inexistente");
        }
        System.out.println("Quantidade de valores na lista: " + pq.size());
        System.out.println(pq);

        System.out.println("Digite um link: ");
        String consulta = ler.nextLine();

        if(pq.contains(consulta)) {
            System.out.println("Link Encontrado!");
        } else {
            System.out.println("Link Não Encontrado");
        }

    }

}