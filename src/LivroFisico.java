public class LivroFisico extends Livro {
    public int numeroDePaginas;

    public LivroFisico(String titulo, String autor, int anoPublicacao, int numeroDePaginas) {
        super(titulo, autor, anoPublicacao);
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo: Livro físico");
        System.out.println("Páginas: " + numeroDePaginas);
    }
}
