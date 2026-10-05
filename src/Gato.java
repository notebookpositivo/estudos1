public class Gato extends Animal{
    public Gato(String nomeAnimal, int idadeAnimal){
        super(nomeAnimal, idadeAnimal);
    }

    @Override
    public void fazerSom(){
        System.out.println("Miau");
    }
}
