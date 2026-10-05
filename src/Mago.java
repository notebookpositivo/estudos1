public class Mago extends Personagem {

    public int mana;

    public Mago(String nomeRPG, int vida, int mana){
        super(nomeRPG, vida);
        this.mana = mana;
    }


    @Override
    public void atacar(Personagem alvo){
        int custo = 6;

        if (mana >= custo ) {
            int dano = mana * 6;
            System.out.println(nome + " atacou " + alvo.nome + " e causou " + dano + " de dano");
            alvo.receberDano(dano);
            mana -= custo;
        } else {
            System.out.println("Sem mana suficiente!");
        }
    }
}
