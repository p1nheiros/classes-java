package classeB;

public class Animal {
    private String especie;
    private float peso;
    private int idade;
    private String sexo;
    private String raca;

    // construtor vazio
    public Animal() {
        System.out.println("Construtor vazio ativado");
    }

    public Animal(String especie, float peso, int idade, String sexo, String raca) {
        this.especie = especie;
        this.peso = peso;
        this.idade = idade;
        this.sexo = sexo;
        this.raca = raca;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void comer() {
        System.out.println("O animal está se alimentando.");
        this.peso += 1;
    }

    public void aniversario() {
        System.out.println("O animal está completando mais um ano de vida.");
        this.idade += 1;
    }

    public void setRaca(String raca) { this.raca = raca;}

    public String getRaca() { return this.raca; }

    public void emitirSom() {
        System.out.println("O animal está emitindo som.");
    }
}
