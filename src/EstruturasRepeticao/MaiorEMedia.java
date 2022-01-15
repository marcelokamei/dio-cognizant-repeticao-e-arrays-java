package EstruturasRepeticao;

    /* Fazer um programa que leia 5 números e
    informe o maior número e a mádia desses números.
     */

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.print("Número: ");
            numero = scan.nextInt();
            if (numero > maior)
                maior = numero;
            count++;
            soma += numero;
        } while (count < 5);

        System.out.println("Maior número digitado: "+maior);
        System.out.println("Média dos números digitados: "+(soma/count));

    }
}
