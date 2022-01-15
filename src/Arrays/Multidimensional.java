package Arrays;
//Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 e 9.

import java.util.Random;

public class Multidimensional {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[5][5];

        for (int l = 0; l < M.length; l++) {
            for (int c = 0; c < M[l].length; c++) {
                M[l][c] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M){
            for (int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        int num = 5, counter=1;
        while(counter<=3){
            ++counter;
            num+=counter;
        }
        System.out.println(num);



    }


}
