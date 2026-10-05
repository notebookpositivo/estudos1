public class Peixe extends Animal{

    public Peixe(String nomeAnimal, int idadeAnimal){
        super(nomeAnimal, idadeAnimal);
    }

    @Override
    public void fazerSom(){
        System.out.println("Glub Glub");
    }
}
