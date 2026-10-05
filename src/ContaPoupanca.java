public class ContaPoupanca extends ContaBancaria{
    public double taxaRendimento;

    public ContaPoupanca(double saldo, double taxaRendimento) {
        super(saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void render() {
        saldo += saldo * taxaRendimento;
    }
}
