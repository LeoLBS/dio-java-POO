package app;

public abstract class AplicativosMensagem {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConexaoInternet(){
        System.out.println("Conexão com a internet validada com sucesso!!");
    }
}
