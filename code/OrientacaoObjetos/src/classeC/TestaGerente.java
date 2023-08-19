package classeC;

public class TestaGerente {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("João da Silva");

        gerente.setSenha(4321);

        gerente.autentica(4321);
    }
}