package classeB;

public class Cachorro extends Animal {
    private String funcionalidade;

    public Cachorro() {
    }

    public Cachorro(String especie, float peso, int idade, String sexo, String raca, String funcionalidade) {
        super(especie, peso, idade, sexo, raca);
        this.funcionalidade = funcionalidade;
    }

    public String getFuncionalidade() {
        return funcionalidade;
    }

    public void setFuncionalidade(String funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    /*public void latir() {
        System.out.println("Ouf Ouf.");
    }*/

    @Override
    public void emitirSom() {
        System.out.println("Ouf Ouf.");
    }
}