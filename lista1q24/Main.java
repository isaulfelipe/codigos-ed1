//Evolua a questão anterior.
//Permita que o programa salve o resultado em um arquivo binário.
//Permita que o programa abra o arquivo binário e exiba os dados de cada objeto Pessoa na tela.


import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String nomeArquivo = "pessoas.bin";

        System.out.print("Quantas pessoas você quer cadastrar: ");
        int numeroDePessoas = scanner.nextInt();

        Pessoa[] listaDePessoas = new Pessoa[numeroDePessoas];

        //lendo os dados das pessoas
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

        // FileOutputStream = conecta ao arquivo para transportar bytes brutos para ele
        // ObjectOutputStream: Converte um objeto Java em uma sequência de bytes que o FileOutputStream consegue transportar
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(listaDePessoas); // oos.writeObject(): Pega o objeto Java, serializa (converte em bytes) e envia para o FileOutputStream.
            System.out.println("\nDados salvos com sucesso no arquivo '" + nomeArquivo + "'!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
            e.printStackTrace();
        }

        // FileInputStream: Transporta os bytes brutos do arquivo para dentro do código
        // ObjectInputStream = Recebe a sequência de bytes vinda do arquivo que FileInputStream transporta para dentro
        // do codigo e usa para reconstruir o objeto Java original com todos os seus dados
        System.out.println("\n--- Lendo dados do arquivo binário ---");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {

            Pessoa[] pessoasLidasDoArquivo = (Pessoa[]) ois.readObject(); // ois.readObject(): Lê os bytes do FileInputStream, desserializa (remonta o objeto) e retorna o objeto pronto.
            // (Pessoa[]): Fazemos o "cast" para dizer ao Java qual é o tipo específico do objeto que foi remontado.

            System.out.println("Pessoas recuperadas do arquivo:");

            for (Pessoa pessoa : pessoasLidasDoArquivo) {
                System.out.println(pessoa);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        }

        scanner.close();

    }

}