public class Cachorro extends Animal{
    public Cachorro(String nomeAnimal, int idadeAnimal){
        super(nomeAnimal, idadeAnimal);
    }

    @Override
    public void fazerSom(){
        System.out.println("Au Au");
    }
}
