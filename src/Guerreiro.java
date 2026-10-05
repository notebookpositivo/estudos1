public class Guerreiro extends Personagem {

    public int forca;

    public Guerreiro(String nomeRPG, int vida, int forca){
        super(nomeRPG, vida);
        this.forca = forca;
    }

    @Override
    public void atacar(Personagem alvo){
        int dano = forca * 4;
        System.out.println(nome + " atacou " + alvo.nome + " e causou " + dano + " de dano");
        alvo.receberDano(dano);

    }

}
