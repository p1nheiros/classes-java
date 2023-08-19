package atividade1;

class Bicicleta extends Veiculo {
    private boolean capaceteColocado;
    private int marcha;

    public Bicicleta(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.capaceteColocado = false;
        this.marcha = 1;
    }

    public boolean isCapaceteColocado() {
        return capaceteColocado;
    }

    public void pedalar() {
        if (capaceteColocado) {
            System.out.println("A biciclera está em movimento.");
        } else {
            System.out.println("Coloque o capacete antes de pedalar!");
        }
    }

    public void colocarCapacete() {
        System.out.println("Capacete colocado.");
        capaceteColocado = true;
    }

    public void ajustarMarcha(int novaMarcha) {
        if (capaceteColocado) {
            marcha = novaMarcha;
            System.out.println("Marcha ajustada para " + marcha);
        } else {
            System.out.println("Coloque o capacete antes de ajustar a marcha!");
        }
    }

    public void frear() {
        if (capaceteColocado) {
            System.out.println("A biciclera está freando.");
        } else {
            System.out.println("Coloque o capacete antes de frear!");
        }
    }

    public void sairDaBicicleta() {
        System.out.println("Você saiu da biciclera.");
        capaceteColocado = false;
    }
}
