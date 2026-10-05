public class Veiculo
{
    public int ano;
    public String marca;
    public String modelo;

    public Veiculo(String marca, String modelo, int ano){
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
    }


    public void exibirInfos(){
        System.out.println(ano);
        System.out.println(marca);
        System.out.println(modelo);
    }
}
