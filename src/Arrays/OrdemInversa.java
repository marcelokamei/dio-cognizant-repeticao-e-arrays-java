package Arrays;
    /* Criar um vertor de 6 numeros inteiros
    e mostre-os na ordem inversa.
     */

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {1,5,15,10,20,25};

        int count = 0;

        System.out.print("Vetor: ");
        while (count<(vetor.length)){
            System.out.print(vetor[count]+" ");
            count++;
        }

        System.out.println();

        System.out.print("Vetor na ordem inversa: ");
        for(int i=(vetor.length-1); i>=0; i--){
            System.out.print(vetor[i]+" ");
        }

    }

}
