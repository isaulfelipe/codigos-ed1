//Construa um programa para ler e exibir uma matriz de inteiros.
//Em tempo de execução, o usuário pode definir o tamanho da matriz.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int tamVetLinha = scanner.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int tamVetColuna = scanner.nextInt();

        int[][] matrix = new int[tamVetLinha][tamVetColuna];

        for(int i = 0; i < tamVetLinha; i++){
            for (int j = 0; j < tamVetColuna; j++){
                System.out.print("Digite o valor para[" + (i+1) + "][" + (j+1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Vetor");
        for(int i = 0; i < tamVetLinha; i++){
            for (int j = 0; j < tamVetColuna; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

    }

}