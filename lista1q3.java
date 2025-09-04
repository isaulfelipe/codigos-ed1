//Construa um programa que leia um número inteiro e identifique se ele é par ou ímpar.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();

        if(calcularImparOuPar(numero)){
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é impar");
        }

    }

    public static boolean calcularImparOuPar(int numero){
        int numeroAbs = Math.abs(numero);

        return numeroAbs % 2 == 0;
    }

}
