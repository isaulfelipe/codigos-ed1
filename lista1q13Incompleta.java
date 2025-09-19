//Construa um programa que calcule o rendimento mensal de um investimento em poupança.
//Variáveis: investimento inicial, investimento mensal, quantidade de meses, saldo acumulado, taxa de juros mensal, rendimento mensal.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //variaveis que o exercicio pede
        double investimentoInicial;
        double investimentoMensal;
        double quantidadeDeMeses;
        double saldoAcumulado;
        double taxaDeJurosMensal;
        double rendimentoMensal;

        //variaveis auxiliares
        double taxaDeJuroAnual;

        System.out.print("Digite o seu investimento inicial(capital inicial): ");
        investimentoInicial = scanner.nextDouble();

        System.out.println("Digite o seu investimento mensal(quanto você vai investir todos): ");
        investimentoMensal = scanner.nextDouble();

        System.out.println("Digite por quantos meses você vai aportar: ");
        quantidadeDeMeses = scanner.nextDouble();

        System.out.println("Digite a taxa de juro anual(em %, tipo x.xx): ");
        taxaDeJuroAnual = scanner.nextDouble();

        taxaDeJurosMensal = calcularTaxaDeJurosMensais(taxaDeJuroAnual);
        System.out.println("A taxa de juros de anuais: " + taxaDeJuroAnual + " taxa de juros mensais: " + taxaDeJurosMensal);
    }

    public static double calcularTaxaDeJurosMensais(double taxaDeJurosAnuais){
        return (taxaDeJurosAnuais)/12.0;
    }


}
