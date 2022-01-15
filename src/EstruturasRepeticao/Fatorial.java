package EstruturasRepeticao;
    /*Fazer um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
    Ex.: 5! = 120
     */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fatorial;
        System.out.print("Digite um número inteiro: ");
        fatorial = scan.nextInt();

        int multiplicacao = 1;

        for(int i=fatorial;i>=1; i--){
            multiplicacao*=i;
        }

        System.out.println(fatorial+"! = "+multiplicacao);

    }


}
