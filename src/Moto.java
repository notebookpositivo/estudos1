public class Moto extends Veiculo{
    public int cilindradas;

    public Moto(String modelo, String marca, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println(cilindradas);
    }

}
