//Distinguir, com base na média parcial do aluno, se ele está
//aprovado, reprovado ou na final. Aplique as regras da UFERSA.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua media parcial: ");
        double mediaParcial = scanner.nextDouble();

        distinguir(mediaParcial);

    }

    public static void distinguir(double media) {

        if (media >= 7) {
            System.out.println("Você esta aprovado média " + media);
        } else if (media < 3.5) {
            System.out.println("Você esta reprovado por média parcial com " + media);
        } else {
            System.out.println("Você esta na quarta prova, sua média é " + media);
        }

    }

}