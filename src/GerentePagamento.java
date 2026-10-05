public class GerentePagamento extends FuncionarioPagamento {
    public GerentePagamento(String nome, double salarioBase) {
        super(nome, salarioBase);
    }


    @Override
    public double calcularPagamento() {
        return salarioBase + salarioBase * 0.20;
    }
}
