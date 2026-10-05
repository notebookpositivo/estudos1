public class Eletronico extends Produto {
    public int garantiaMeses;
    public String voltagem;

    public Eletronico(String nome, double preco, int garantiaMeses, String voltagem) {
        super(nome, preco);
        this.garantiaMeses = garantiaMeses;
        this.voltagem = voltagem;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Garantia: " + garantiaMeses + " meses");
        System.out.println("Voltagem: " + voltagem);
    }
}
