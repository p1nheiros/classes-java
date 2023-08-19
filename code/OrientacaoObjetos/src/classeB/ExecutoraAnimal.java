package classeB;

public class ExecutoraAnimal {
    public static void main(String[] args) {

        /*Animal animal = new Animal("Homo Sapiens");
        System.out.println(animal.getEspecie());
        animal.setEspecie("Caes");
        System.out.println(animal.getEspecie());*/

        /*Animal animal = new Animal("Homo Sapiens", 70.0f, 18, "M", "pardo");
        //animal.comer();
        //System.out.println("O peso atual é de : " + animal.getPeso());*/

        Cachorro cachorro = new Cachorro("Cannis Lupus", 15.0f, 10, "M", "Pastor Alemão", "Guia");
        /*cachorro.comer();
        System.out.println("O peso atual é de : " + cachorro.getPeso());

        Leao leao = new Leao("Panthera Leo", 100.0f, 8, "M", "", true);
        leao.fazerAniversario();
        animal.fazerAniversario();*/

        Animal animal = new Animal();
        animal.emitirSom();

        //Cachorro cachorro = new Cachorro();
        //cachorro.emitirSom();

        //Animal animal2 = cachorro;
        //animal2.emitirSom();

        Leao leao = new Leao();

        Veterinario veterinario = new Veterinario("Pedro", 32, 1.85f, "Veterinário", 92.f, "1234");
        veterinario.vacinar(leao);

    }
}