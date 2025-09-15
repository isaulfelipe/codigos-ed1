//Construa um programa que calcule uma equação do 2º grau.
//Crie um metodo com retorno para calcular o delta.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite seu B: ");
        double b = scanner.nextDouble();
        System.out.print("Digite seu C: ");
        double c = scanner.nextDouble();



        if(a == 0){
            System.out.println("Não é uma equação do 2º grau. O valor de 'a' não pode ser 0.");
        } else {

            double raizDelta = delta(a, b, c);

            if(raizDelta >= 0.0){
                System.out.println("Delta = " + raizDelta);
                System.out.println("S = {" + x1(a, b, raizDelta) + "," + x2(a, b, raizDelta) + "}");
            } else {
                System.out.println("A equação não possui raízes reais");
            }

        }

    }

    public static double delta(double a, double b, double c){
        return Math.sqrt(((Math.pow(b, 2)) - 4 * a * c));
    }

    public static double x1(double a, double b, double delta){
        return ((-b) + (delta))/(2.0 * a);
    }

    public static double x2(double a, double b, double delta){
        return ((-b) - (delta))/(2.0 * a);
    }
}