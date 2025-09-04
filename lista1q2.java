//Construa um programa que calcule a área de um círculo, tendo como entrada o
//valor do raio, que 1deve ser positivo. Use o valor da constante PI vindo da biblioteca matemática.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        double raio = scanner.nextDouble();

        DecimalFormat df = new DecimalFormat("0.00");

        try {
            double area = calcularArea(raio);

            System.out.println("Area: " + df.format(area));
        } catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }

    public static double calcularArea(double raio){
        if(raio <= 0 ){
            throw new IllegalArgumentException("O raio deve ser maior que 0.");
        }
        return Math.PI * Math.pow(raio, 2);
    }

}
