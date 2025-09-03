// Calcular o IMC (índice de massa corporal) de uma pessoa. Produza um alerta em caso de divisão por zero.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Main pessoa = new Main();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        DecimalFormat df = new DecimalFormat("0.00");

        try {
            double imc = pessoa.calcularImc(peso, altura);
            System.out.println("Seu imc é " + df.format(imc));
        } catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }

    public double calcularImc(double peso, double altura){
        if (altura <= 0 || peso <= 0) {
            throw new IllegalArgumentException("Altura e/ou peso devem ser valores positivos.");
        }

        return peso / (altura * altura);
    }
}
