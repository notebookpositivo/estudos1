public class FuncionarioPagamento {
    public String nome;
    public double salarioBase;

    public FuncionarioPagamento(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularPagamento() {
        return salarioBase;
    }
}
