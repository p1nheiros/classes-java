package classeB;

public class Veterinario extends Pessoa{
    private String CRMV;

    public Veterinario(String nome, int idade, float altura, String profissao, float peso, String CRMV) {
        super(nome, idade, altura, profissao, peso);
        this.CRMV = CRMV;
    }

    public String getCRMV() {
        return CRMV;
    }

    public void setCRMV(String CRMV) {
        this.CRMV = CRMV;
    }

    public void vacinar(Animal animal) {
        System.out.println("O veterinario(A) " + super.getNome() + " está aplicando uma vacina em um animal da especie:" + animal.getEspecie());
        System.out.print("O animal emitiu o seguinte som: " );
        animal.emitirSom();
    }
}