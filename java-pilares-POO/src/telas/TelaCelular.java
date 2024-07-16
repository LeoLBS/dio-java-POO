package telas;

import app.AplicativosMensagem;
import app.Facebook;
import app.MSNMensagem;
import app.Telegram;

public class TelaCelular {
    public static void main(String[] args) {
        AplicativosMensagem mensg = null;

        String abrirAplicativo = "tlg";

        if (abrirAplicativo.equals("msn")){
            mensg = new MSNMensagem();
        }else if (abrirAplicativo.equals("tlg")) {
            mensg = new Telegram();
        } else if (abrirAplicativo.equals("face")) {
            mensg = new Facebook();
        }

        mensg.enviarMensagem();
        mensg.receberMensagem();
    }
}
