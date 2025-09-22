//Construa um programa com um metodo que calcule o somatório dos números inteiros de um intervalo, definido por um número inicial e um número final.
//Use uma estrutura de repetição. Exemplo: caso as entradas fossem 4 e 9, o resultado seria: 39

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro inicial: ");
        int numInicial = scanner.nextInt();

        System.out.print("Digite um numero inteiro final: ");
        int numFinal = scanner.nextInt();

        System.out.println("Resultado do somatório de " + numInicial + " até " + numFinal + " é " + calculoSomatorio(numInicial, numFinal));

        scanner.close();

    }

    public static int calculoSomatorio(int numInicial, int numFinal){
        int numeroSomatorio = 0;

        for(int i = numInicial; i <= numFinal; i++){
            numeroSomatorio += i;
        }
        return numeroSomatorio;
    }


}
