//Construa um programa que calcule o rendimento mensal de um investimento em poupança.
//Variáveis: investimento inicial, investimento mensal, quantidade de meses, saldo acumulado, taxa de juros mensal, rendimento mensal.

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00");

        //variaveis que o exercicio pede
        double investimentoInicial;
        double investimentoMensal;
        int quantidadeDeMeses;
        double saldoAcumulado;
        double taxaDeJurosMensal;
        double rendimentoMensal;

        //variaveis auxiliares
        double taxaDeJuroAnual;

        System.out.print("Digite o seu investimento inicial(capital inicial): ");
        investimentoInicial = scanner.nextDouble();

        System.out.print("\nDigite o seu investimento mensal(quanto você vai investir todos): ");
        investimentoMensal = scanner.nextDouble();

        System.out.print("\nDigite por quantos meses você vai aportar: ");
        quantidadeDeMeses = scanner.nextInt();

        System.out.print("\nDigite a taxa de juro anual(em %, tipo x.xx): ");
        taxaDeJuroAnual = scanner.nextDouble();

        taxaDeJurosMensal = calcularTaxaDeJurosMensais(taxaDeJuroAnual);
        System.out.println("A taxa de juros de anuais: " + taxaDeJuroAnual + "% e a taxa de juros mensais: %" + df.format(taxaDeJurosMensal));

        saldoAcumulado = investimentoInicial;
        System.out.println("--- Simulação de Investimento ---");
        for (int i = 1; i <= quantidadeDeMeses; i++) {
            saldoAcumulado += investimentoMensal;

            rendimentoMensal = saldoAcumulado * (taxaDeJurosMensal / 100);

            saldoAcumulado += rendimentoMensal;

            System.out.println("Mês " + i);
            System.out.println("Saldo antes dos juros: R$ " + df.format(saldoAcumulado - rendimentoMensal));
            System.out.println("Aporte mensal: R$ " + df.format(investimentoMensal));
            System.out.println("Rendimento no mês: R$ " + df.format(rendimentoMensal));
            System.out.println("Saldo no final do mês: R$ " + df.format(saldoAcumulado) + "\n");
        }

        double totalInvestidoSemJuros = investimentoInicial;
        for(int i = 1; i <= quantidadeDeMeses; i++){
            totalInvestidoSemJuros += investimentoMensal;
        }

        System.out.println("O investimento total foi: R$ " + df.format(totalInvestidoSemJuros));
        System.out.println("Saldo acumulado total: R$ " + df.format(saldoAcumulado));
        System.out.println("O Juros no total foi de: R$ " + df.format(saldoAcumulado - totalInvestidoSemJuros));

        scanner.close();

    }

    public static double calcularTaxaDeJurosMensais(double taxaDeJurosAnuais) {
        double taxaDecimalMensal = Math.pow((1 + (taxaDeJurosAnuais / 100.0)), (1.0 / 12.0)) - 1;
        return taxaDecimalMensal * 100;
    }
    
}
