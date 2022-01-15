package EstruturasRepeticao;

    /* Desenvolva um gerador de Tabuada capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
    O usuário deve informar qual número ele deseja da tabuada.
    */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Qual tabuada deseja ver? ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}
