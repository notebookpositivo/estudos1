public class DesenvolvedorPagamento extends FuncionarioPagamento {
    public DesenvolvedorPagamento(String nome, double salarioBase) {
        super(nome, salarioBase);
    }


    @Override
    public double calcularPagamento() {

        return salarioBase + 500;
    }
}
