package classeA;

public class Executora {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Carla", 15, 1.55f, "Estudante", 50.0f);

        /*System.out.println("O nome da pessoa é igual a: " + pessoa2.getNome());
        pessoa2.setNome("Ricardo");
        System.out.println("O nome da pessoa é igual a: " + pessoa2.getNome()); */

        pessoa.correr();
        pessoa2.correr();

        int teste = 030;
        System.out.println(teste);
    }
}