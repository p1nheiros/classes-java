package classeB;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private String profissao;
    private float peso;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, float altura, String profissao, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.profissao = profissao;
        this.peso = peso;
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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void correr() {
        System.out.println("A pessoa cujo nome é: " + this.nome + " está correndo.");
    }
}