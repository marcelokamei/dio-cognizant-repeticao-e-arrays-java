package Arrays;
        /*Fazer um programa que leia um vetor de 6 caracteres
        e informe quntas consoantes foram lidas e as imprima.
         */

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int count = 0;

        do {
            System.out.print("Digite uma letra: ");
            String letra = scan.next();

            if(   !(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            count++;
        } while (count<consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if(consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println();
        System.out.println("Quantidade de consoantes: "+quantidadeConsoantes);

    }
}
