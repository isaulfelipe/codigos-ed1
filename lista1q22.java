//Construa um programa que identifique o maior e o menor número de um vetor de inteiros

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o tamanho do vetor de inteiro: ");
        int tamVet = scanner.nextInt();

        int[] vet = new int[tamVet];

        for(int i = 0; i < tamVet; i++){
            vet[i] = random.nextInt(1000);
        }

        System.out.print("Vetor Original: ");
        for(int indice : vet){
            System.out.print(indice + " ");
        }

        int numMenor = vet[0];
        int numMaior = vet[0];

        for(int indice : vet){
            if(indice < numMenor){
                numMenor = indice;
            }
        }

        for(int indice : vet){
            if(indice > numMaior){
                numMaior = indice;
            }
        }

        System.out.print("\nNumero menor: " + numMenor + "\nNumero maior: " + numMaior);

    }
