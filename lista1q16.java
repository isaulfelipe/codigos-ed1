//Construa um programa com um método que calcule o número fatorial de um número. Use uma estrutura de repetição.
//Exemplo: 5! = 5 x 4 x 3 x 2 x 1 = 120 ou 5! = 1 x 2 x 3 x 4 x 5 = 120

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero para calcular o fatorial: ");
        int num = input.nextInt();

        int numeroCalcFat = 1;

        for(int i = 1; i <= num; i++){
            numeroCalcFat *= i;
        }

        System.out.println("Fatorial de " + num +  ": " + numeroCalcFat);


        input.close();
    }
}