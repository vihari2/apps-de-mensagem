package apps;

public class Telegram extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoAInternet();
        System.out.println("Enviando mensagem pelo apps.Telegram");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo apps.Telegram");
    }
}