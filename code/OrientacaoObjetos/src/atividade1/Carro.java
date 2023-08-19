package atividade1;

class Carro extends Veiculo {

    private int numPortas;
    private boolean cintoColocado;

    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    @Override
    public void acelerar() {
        if (cintoColocado) {
            System.out.println("O carro está acelerando.");
        } else {
            System.out.println("Coloque o cinto antes de acelerar!");
        }
    }

    @Override
    public void frear() {
        if (cintoColocado) {
            System.out.println("O carro está freando.");
        } else {
            System.out.println("Coloque o cinto antes de frear!");
        }
    }

    public void colocarCinto() {
        System.out.println("Cinto colocado.");
        cintoColocado = true;
    }

    public void sairDoCarro() {
        System.out.println("Você saiu do carro.");
        cintoColocado = false;
    }

    public void fazerDrift() {
        if (cintoColocado) {
            System.out.println("O carro está fazendo drift!");
        } else {
            System.out.println("Coloque o cinto antes de fazer um drift!");
        }
    }
}
