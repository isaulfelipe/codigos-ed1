//Construa um programa para exibir a tabuada de qualquer número inteiro (1 a 9), fornecido pelo usuário.
//Utilize estrutura de repetição.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero da tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Usando While");
        usandoWhile(numero);
        System.out.println("Usando Do-While");
        usandoDoWhile(numero);
        System.out.println("Usando For");
        usandoFor(numero);


    }

    public static void usandoWhile(int numero) {

        int i = 1;
        while(i <= 10){
            System.out.println(i + " * " + numero + " = " + i * numero);
            i++;
        }
    }

    public static void usandoDoWhile(int numero) {

        int i = 1;
        do {
            System.out.println(i + " * " + numero + " = " + i*numero);
            i++;
        } while (i <= 10);
    }

    public static void usandoFor(int numero) {

        for(int i = 1; i <= 10;i++){
            System.out.println(i + " * " + numero + " = " + i*numero);
        }
    }

}