public class Carro extends Veiculo{

    public int portas;
    public Carro (String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    @Override
    public void exibirInfos(){
        super.exibirInfos();
        System.out.println(portas);

    }
}


