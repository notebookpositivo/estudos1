public class Personagem {
    public String nome;
    public int vida;

    public Personagem(String nome, int vida){
        this.nome = nome;
        this.vida = vida;
    }


    public void receberDano(int dano){
        vida -= dano;

        if ( vida < 0){
            vida = 0;
        }
    }

    public boolean estaVivo(){
        return vida > 0;
    }

    public void atacar(Personagem alvo) {
        int dano = 10;
        System.out.println(nome + " atacou " + alvo.nome + " e causou " + dano + " de dano");
        alvo.receberDano(dano);
    }
}
