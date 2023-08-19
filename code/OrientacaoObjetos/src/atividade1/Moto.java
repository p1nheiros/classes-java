package atividade1;

class Moto extends Veiculo {
    private boolean capaceteColocado;

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.capaceteColocado = false;
    }

    public boolean isCapaceteColocado() {
        return capaceteColocado;
    }

    @Override
    public void acelerar() {
        if (capaceteColocado) {
            System.out.println("A moto está acelerando.");
        } else {
            System.out.println("Coloque o capacete antes de acelerar!");
        }
    }

    @Override
    public void frear() {
        if (capaceteColocado) {
            System.out.println("A moto está freando.");
        } else {
            System.out.println("Coloque o capacete antes de frear!");
        }
    }

    public void colocarCapacete() {
        System.out.println("Capacete colocado.");
        capaceteColocado = true;
    }

    public void sairDaMoto() {
        System.out.println("Você saiu da moto.");
        capaceteColocado = false;
    }

    public void empinar() {
        if (capaceteColocado) {
            System.out.println("A moto está empinando!");
        } else {
            System.out.println("Coloque o capacete antes de empinar a moto!");
        }
    }
}
