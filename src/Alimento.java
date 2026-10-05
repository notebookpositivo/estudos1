public class Alimento extends Produto {
    public String dataValidade;
    public double peso; // em kg

    public Alimento(String nome, double preco, String dataValidade, double peso) {
        super(nome, preco);
        this.dataValidade = dataValidade;
        this.peso = peso;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Validade: " + dataValidade);
        System.out.println("Peso: " + peso + " kg");
    }
}
