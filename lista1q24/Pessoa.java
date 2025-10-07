import java.io.Serializable;

public class Pessoa implements Serializable {
    private long cpf;
    private String nome;
    private int idade;
    private char sexo;
    private double peso;
    private double altura;
    private double imc;

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public Pessoa(long cpf, String nome, int idade, char sexo, double peso, double altura) {
        setCpf(cpf);
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setPeso(peso);
        setAltura(altura);
        setImc( peso / (Math.pow(2, altura)) );
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ", imc=" + String.format("%.2f", imc) +
                '}';
    }
}