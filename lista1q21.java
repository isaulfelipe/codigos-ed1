//Construa um programa e um metodo que inverta a frase digitada pelo usuário.
//Exemplo, se string1 for “bom dia”, string2 será “aid mob”. por parâmetro.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase para inverter: ");
        String string1 = scanner.nextLine();

        char[] string1Array = string1.toCharArray();
        char[] string2Array = new char[string1Array.length];

        int i = string1.length() - 1;
        int j = 0;
        while(i >= 0){
            string2Array[i] = string1Array[j];
            i--;
            j++;
        }

        String string2 = new String(string2Array);
        System.out.println(string2);
        
    }
}