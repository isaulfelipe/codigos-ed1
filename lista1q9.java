//Construa um programa que leia do usuário um número inicial e um número final.
//Em seguida, exiba na tela uma sequência com os números desse intervalo informado pelo usuário.
//Exemplo: caso o usuário entre com os números 4 e 10, o resultado do programa seria: 4 5 6 7 8 9 10
//a) Construa este programa utilizando a estrutura while.
//b) Construa este programa utilizando a estrutura do-while.
//c) Construa este programa utilizando a estrutura for

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o inicio: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o fim: ");
        int fim = scanner.nextInt();

        System.out.print("Usando While: " );
        usandoWhile(inicio, fim);
        System.out.print("Usando Do-While: " );
        usandoDoWhile(inicio, fim);
        System.out.print("Usando For: " );
        usandoFor(inicio, fim);

    }

    public static void usandoWhile(int inicio, int fim){
        int i = inicio;

        while (i <= fim){
            System.out.print(i + " ");
            i++;
        }

        System.out.println(" ");

    }

    public static void usandoDoWhile(int inicio, int fim){
        int i = inicio;

        do{
            System.out.print(i + " ");
            i++;
        }while (i <= fim);

        System.out.println(" ");

    }

    public static void usandoFor(int inicio, int fim){

        for(int i = inicio; fim >= i; i++){
            System.out.print(i + " ");
        }

        System.out.println(" ");
    }

}