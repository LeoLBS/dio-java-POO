package app;

public class Facebook extends AplicativosMensagem{

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem com o Facebook");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem com o Facebook");
    }
}
