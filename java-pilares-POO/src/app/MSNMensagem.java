package app;

public class MSNMensagem extends AplicativosMensagem{

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem com o MSN");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem com o MSN");
    }
}
