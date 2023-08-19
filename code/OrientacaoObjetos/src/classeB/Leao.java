package classeB;

public class Leao extends Animal {
    private boolean juba;

    public Leao() {
    }

    public Leao(String especie, float peso, int idade, String sexo, String raca, boolean juba) {
        super(especie, peso, idade, sexo, raca);
        this.juba = juba;
    }

    public boolean isJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }

    @Override
    public void emitirSom() {
        System.out.println("ROAR!");
    }


}