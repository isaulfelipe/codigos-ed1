//Construa um programa que calcule para o aluno sua média parcial e informe sua situação parcial (Aprovado, Recuperação ou Reprovado).
//Caso ele esteja em Recuperação, solicite a nota da 4ª prova, e informe a situação (Aprovado ou Reprovado). Utilize as regras da UFERSA.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double mediaParcial = calcularMediaParcial();

        resultadoMediaParcial(mediaParcial);

    }

    public static double calcularMediaParcial(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota da p1: ");
        double p1 = scanner.nextDouble();
        System.out.print("Digite sua nota da p2: ");
        double p2 = scanner.nextDouble();
        System.out.print("Digite sua nota da p3: ");
        double p3 = scanner.nextDouble();

        return (p1+p2+p3)/3;
    }

    public static void resultadoMediaParcial(double mediaParcial) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        if (mediaParcial >= 7) {
            System.out.println("Você esta APROVADO com média " + df.format(mediaParcial));
        } else if (mediaParcial < 3.5) {
            System.out.println("Você esta REPROVADO por média parcial com " + df.format(mediaParcial));
        } else {
            System.out.println("Você esta na quarta prova, sua média parcial é " + df.format(mediaParcial));
            System.out.print("Digite sua nota da p4: ");
            double p4 = scanner.nextDouble();

            double mediaFinal = calcularMediaFinal(mediaParcial, p4);

            if (mediaFinal >= 5){
                System.out.println("Você esta APROVADO com media parcial de " + df.format(mediaParcial) + " e media final de " + df.format(mediaFinal));
            } else {
                System.out.println("Você REPROVOU com media parcial de " + df.format(mediaParcial) + " e media final de " + df.format(mediaFinal));
            }

        }

    }

    public static double calcularMediaFinal(double mediaParcial, double p4){
        return ((mediaParcial * 6) + (p4 * 4)) / 10;
    }

}