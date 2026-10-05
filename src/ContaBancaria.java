public class ContaBancaria {
    public double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if ( valor > saldo) {
            System.out.println("Sem saldo suficiente");
        } else {
            System.out.println("Saque efetuado");
            saldo -= valor ;
        }
    }

    public void depositar(double valor){
        if ( valor > 0){
            System.out.println("Deposito com sucesso");
            saldo += valor;
        } else {
            System.out.println("Digite um valor maior que 0!");
        }
    }
}
