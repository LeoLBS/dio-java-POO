package app;

public class Telegram extends AplicativosMensagem{

    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando mensagem com o Telegram");
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem com o Telegram");
    }
}
