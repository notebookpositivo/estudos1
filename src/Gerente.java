public class Gerente extends FuncBase{
    public double bonusGerente;

    public Gerente(String nome, double salarioBase, double bonusGerente){
        super(nome, salarioBase);
        this.bonusGerente = bonusGerente;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println(salarioBase + bonusGerente);
    }
}
