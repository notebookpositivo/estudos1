public class Email implements Notificacao {
    public String destinatario;
    public String mensagem;

    public Email(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    @Override
    public void enviar() {
        System.out.println("E-mail para " + destinatario + ": " + mensagem);
    }
}
