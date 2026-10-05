public class Ebook extends Livro {
    public double tamanhoDoArquivo; // em MB

    public Ebook(String titulo, String autor, int anoPublicacao, double tamanhoDoArquivo) {
        super(titulo, autor, anoPublicacao);
        this.tamanhoDoArquivo = tamanhoDoArquivo;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo: Ebook");
        System.out.println("Tamanho do arquivo: " + tamanhoDoArquivo + " MB");
    }
}
