public class CartaAtaque extends Carta {
    public CartaAtaque(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public void jogar() {
        System.out.println("[ATAQUE] " + nome + ": causa " + valor + " de dano no inimigo!");
    }
}
