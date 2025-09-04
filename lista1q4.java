//Construa um programa que simule uma transferência bancária, entre duas contas.
//Primeiro, inicialize cada conta com R$ 100.
//Depois, permita que o usuário defina quanto deve transferir, da conta1 para a conta2, porém a transferência
//só deve ser realizada caso haja saldo suficiente.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldoConta1 = 100;
        double saldoConta2 = 100;

        System.out.print("Digite você quer mandar: R$");
        double valorTransferencia = scanner.nextDouble();

        try {
            validarTransferencia(saldoConta1, saldoConta2, valorTransferencia);
        } catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }

    public static void validarTransferencia(double saldoConta1, double saldoConta2, double valorTransferencia){
        if(valorTransferencia <= 0){
            throw new IllegalArgumentException("O valor da transferencia tem que ser positivo");
        } else if (valorTransferencia > saldoConta1){
            throw new IllegalArgumentException("O valor da transferencia tem que ser menor que o da conta devedora");
        } else {
            fazendoTransferencia(saldoConta1, saldoConta2, valorTransferencia);
        }
    }

    public static void fazendoTransferencia(double saldoConta1,
                                            double saldoConta2,
                                            double valorTransferencia){
        System.out.println("Transferencia feita.");
        System.out.println("Valor da Transferencia: " + valorTransferencia);
        System.out.println("Saldo Conta 1: " + (saldoConta1 - valorTransferencia));
        System.out.println("Saldo Conta 2: " + (saldoConta2 + valorTransferencia));
    }

}
