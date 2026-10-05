public class Dev extends FuncBase{
    public double bonusDev;

    public Dev(String nome, double salarioBase, double bonusDev) {
        super(nome, salarioBase);
        this.bonusDev = bonusDev;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println(salarioBase + bonusDev);
    }
}
