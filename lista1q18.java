//Construa um programa para ler e exibir um vetor de inteiros. Em tempo de execução, o usuário pode definir o tamanho do vetor.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamVet = scanner.nextInt();

        int[] meuArray = new int[tamVet];

        for(int i = 0; i < tamVet; i++){
            System.out.print("Digite o valor para o vetor no índice " + i + ": ");
            meuArray[i] = scanner.nextInt();
        }

        for(int i = 0; i < tamVet; i++){
            System.out.println("Valor para o vetor no índice " + i + ": " + meuArray[i]);
        }

    }

}
