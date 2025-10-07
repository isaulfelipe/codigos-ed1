//Construa um programa que registre objetos da classe Pessoa, com os seguintes atributos: cpf, nome, idade, sexo, peso, altura, imc.
//Permita que o usuário defina a quantidade de pessoas em tempo de execução.
//Ao cadastrar uma pessoa, calcule o IMC (Índice de Massa Corporal).
//Ao final,exiba a lista de pessoas (com seus respectivos atributos).

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantas pessoas você quer cadastrar: ");
        int numeroDePessoas = scanner.nextInt();

        Pessoa[] listaDePessoas = new Pessoa[numeroDePessoas];

        for (int i = 0; i < numeroDePessoas; i++) {
            System.out.println("\n--- Cadastro da Pessoa " + (i + 1) + " ---");

            System.out.print("CPF (apenas números): ");
            long cpf = scanner.nextLong();
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Peso: ");
            double peso = scanner.nextDouble();

            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            listaDePessoas[i] = new Pessoa(cpf, nome, idade, sexo, peso, altura);
        }

        System.out.println("Pessoas cadatradas");
        for(Pessoa pessoa : listaDePessoas){
            System.out.println(pessoa.toString());
        }

        scanner.close();

    }
}
