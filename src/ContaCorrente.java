public class ContaCorrente extends ContaBancaria {
    public double limite;

    public ContaCorrente(double saldo, double limite){
        super(saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if ( valor >( saldo + limite)) {
            System.out.println("Sem saldo suficiente");
        } else {
            System.out.println("Saque efetuado");
            saldo -= valor ;
        }
    }
}
