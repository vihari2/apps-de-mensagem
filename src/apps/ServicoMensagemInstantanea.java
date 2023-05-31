package apps;

//classe pai
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();


    //Somente as classes filhas e classes do mesmo pacote conhecem esse método
    protected void validarConectadoAInternet() {
        System.out.println("Validando conexão com a internet");
    }
}