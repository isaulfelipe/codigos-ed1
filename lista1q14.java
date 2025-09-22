//Construa um programa que identifique se um número é primo.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero(inteiro) para saber se ele é primo: ");
        int numero = scanner.nextInt();

        int qntDivisores = 0;

        for (int i = 1; i <= numero; i++){
            if(numero%i==0){
                qntDivisores += 1;
            }
        }

        if(qntDivisores == 2){
            System.out.println(numero + " é primo");
        } else {
            System.out.println(numero + " não é primo");
        }

        scanner.close();

    }

}
