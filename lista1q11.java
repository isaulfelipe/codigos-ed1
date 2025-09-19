//Verificar se a senha, informada durante a execução, é correta.
//Quando a senha estiver correta, exiba “senha correta” e o programa é encerrado.
//Quando a senha estiver errada, exiba “senha incorreta”, e permita a entrada novamente até que a senha informada seja correta.
//a) Resolva esse problema utilizando a estrutura while.
//b) Resolva esse problema utilizando a estrutura do-while.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua senha para salvar: ");
        String senha = scanner.nextLine();

        System.out.println("Usando While");
        usandoWhile(senha);
        System.out.println("Usando Do-While");
        usandoDoWhile(senha);

    }

    public static void usandoWhile(String senha) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha novamente: ");
        String senhaParaTestar = scanner.nextLine();

        while(!senha.equals(senhaParaTestar)){
            System.out.println("Senha Incorreta");
            System.out.print("Digite a senha novamente: ");
            senhaParaTestar = scanner.nextLine();

            if(senha.equals(senhaParaTestar)){
                System.out.println("Senha Correta");
                System.out.println(" ");
            }
        }

    }

    public static void usandoDoWhile(String senha) {
        Scanner scanner = new Scanner(System.in);

        String senhaParaTestar;

        do {
            System.out.print("Digite a senha novamente: ");
            senhaParaTestar = scanner.nextLine();

            if (senha.equals(senhaParaTestar)) {
                System.out.println("Senha Correta");
                System.out.println(" ");
            } else {
                System.out.println("Senha Incorreta");
            }

        } while (!senha.equals(senhaParaTestar));

    }

}