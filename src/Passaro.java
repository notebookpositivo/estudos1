public class Passaro extends Animal {
    public Passaro(String nomeAnimal, int idadeAnimal) {
        super(nomeAnimal, idadeAnimal);
    }

    @Override
    public void fazerSom() {
        System.out.println("Piu Piu");
    }
}
