package Arrays;
        /*Fazer um programa que leia 20 numeros aleatorios inteiros entre 0 e 100,
        armezene-os num vetor e ao final mostre os números e seus sucessores.
         */

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numerosAleatorios = new int[20];

        for(int i=0;i<numerosAleatorios.length;i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números aleatórios: ");
        for(int numero : numerosAleatorios){
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos números aleatórios: ");
        for(int numero : numerosAleatorios){
            System.out.print((numero+1) + " ");
        }

        System.out.print("\nAntecessores dos números aleatórios: ");
        for(int numero : numerosAleatorios){
            System.out.print((numero-1) + " ");
        }
    }
}
