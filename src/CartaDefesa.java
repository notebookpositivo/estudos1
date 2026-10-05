public class CartaDefesa extends Carta {
    public CartaDefesa(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public void jogar() {
        System.out.println("[DEFESA] " + nome + ": bloqueia " + valor + " de dano!");
    }
}
