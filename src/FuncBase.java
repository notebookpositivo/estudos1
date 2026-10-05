public class FuncBase {

    public String nome;
    public double salarioBase;

    public FuncBase(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void exibirInfo(){
        System.out.println(nome);
        System.out.println(salarioBase);
    }
}
