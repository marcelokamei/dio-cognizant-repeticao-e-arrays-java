package EstruturasRepeticao;

    /*
    Faça um programa que peça N números interios.
    Calcule e mostre a quantidade de números pares
    e a quantidade de números impares.
    */

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int quantidadeNumeros;
        int numero;
        int count = 0;
        int quantidadePares = 0, quantidadeImpares = 0;

        System.out.print("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        do {
            System.out.print("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                quantidadePares++;
            else quantidadeImpares++;

            count++;
        } while (count < quantidadeNumeros);

        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);

    }
}
