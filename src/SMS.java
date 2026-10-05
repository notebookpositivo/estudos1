public class SMS implements Notificacao {
    public String telefone;
    public String mensagem;

    public SMS(String telefone, String mensagem) {
        this.telefone = telefone;
        this.mensagem = mensagem;
    }

    @Override
    public void enviar() {
        System.out.println("SMS para " + telefone + ": " + mensagem);
    }
}
