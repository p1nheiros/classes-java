package atividade1;

class Caminhao extends Veiculo {
    private boolean cintoColocado;
    private boolean carregado;

    public Caminhao(String marca, String modelo, int ano, boolean carregado) {
        super(marca, modelo, ano);
        this.carregado = carregado;
    }

    public boolean isCarregado() {
        return carregado;
    }

    @Override
    public void acelerar() {
        if (cintoColocado) {
            System.out.println("O caminhão está acelerando.");
        } else {
            System.out.println("Coloque o cinto antes de acelerar!");
        }
    }

    @Override
    public void frear() {
        if (cintoColocado) {
            System.out.println("O caminhão está freando.");
        } else {
            System.out.println("Coloque o cinto antes de frear!");
        }
    }

    public void colocarCinto() {
        System.out.println("Cinto colocado.");
        cintoColocado = true;
    }

    public void sairDoCaminhao() {
        System.out.println("Você saiu do caminhão.");
        cintoColocado = false;
    }
}
