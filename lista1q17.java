//Construa um programa que simule uma calculadora. Disponibilize um menu de opções e simule a opção desejada, exibindo novamente o menu, até que o usuário escolha sair.
//Menu de opções: 1 - potenciação Dica: utilize a função da biblioteca matemática.
//                2 - raiz quadrada Dica: utilize a função da biblioteca matemática.
//                3 - fatorial Dica: utilize o método da questão anterior.
//                0 - sair

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Calculadora");
        System.out.println("1 - potenciação.\n2 - raiz quadrada\n3 - fatorial\n0 - sair");
        System.out.print("Digite um numero: ");
        int opcao = input.nextInt();

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    potencia();
                    break;
                case 2:
                    raizQuadrada();
                    break;
                case 3:
                    fatorial();
                    break;
                default:
                    System.out.println("Opção Invalida");
                    System.out.println("Digite algo valido");
            }
            System.out.println("\n1 - potenciação.\n2 - raiz quadrada\n3 - fatorial\n0 - sair");
            System.out.print("Digite um numero: ");
            opcao = input.nextInt();

        }
        System.out.println("Saindo...");

        input.close();
    }

    public static void fatorial(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero para calcular o fatorial: ");
        int numFat = input.nextInt();

        int numeroCalcFat = 1;

        for (int i = 1; i <= numFat; i++) {
            numeroCalcFat *= i;
        }

        System.out.println("Fatorial de " + numFat + ": " + numeroCalcFat);
    }

    public static void potencia(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = input.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = input.nextInt();

        System.out.println("Potencia de " + base + " elevado a " + expoente + ": " + Math.pow(base, expoente));
    }

    public static void raizQuadrada(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero para calcular a Raiz Quadrada: ");
        double numRaiz = input.nextDouble();

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Raiz quadrada de " + numRaiz + ": " + df.format(Math.sqrt(numRaiz)));
    }

}