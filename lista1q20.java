//Construa um programa e um metodo que produz um novo vetor de inteiros com a ordem inversa do vetor original passado por parâmetro.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamVet = scanner.nextInt();

        int[] vetor = new int[tamVet];

        //Add values in array
        for (int i = 0; i < tamVet; i++) {
            System.out.print("Digite o valor para[" + (i + 1) + "]: ");
            vetor[i] = scanner.nextInt();
        }

        //Reverse a array
        for (int i = 0, j = vetor.length - 1; i < j; i++, j--) {
            int valorTemporario = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = valorTemporario;
        }

        //Print in screen
        System.out.print("Vetor invertido: ");
        for (int item : vetor) {
            System.out.print(item + " ");
        }

    }

}