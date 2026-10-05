public class Carta {
    public String nome;
    public int valor;

    public Carta(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void jogar() {
        System.out.println("Você jogou a carta " + nome + ".");
    }
}
