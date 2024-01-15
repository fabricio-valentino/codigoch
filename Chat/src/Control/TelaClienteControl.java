package Control;

import Model.Mensagem;
import Model.Mensagem.Action;
import View.TelaCliente;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaClienteControl implements Runnable {

    private TelaCliente View;
    private ObjectInputStream entrada;
  

    public TelaClienteControl(Socket soquete) {
        try {
            this.entrada = new ObjectInputStream(soquete.getInputStream());
            this.View = new TelaCliente();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void run() {

        Mensagem mensagem = null;
        try {
            while ((mensagem = (Mensagem) entrada.readObject()) != null) {
                //receb a acao que o server esta enviando
                Action acaoserver = mensagem.getAcoesUser();

                if (acaoserver.equals(Action.conectar)) {
                    conexao(mensagem);
                } else if (acaoserver.equals(Action.desconectar)) {
                    desconectar(mensagem);
                } else if (acaoserver.equals(Action.recebeMsg)) {
                    recebeMsg(mensagem);
                } else if (acaoserver.equals(Action.mandaMsg)) {
                    mandaMsg(mensagem);
                } else if (acaoserver.equals(Action.online)) {
                    atualizaOnline(mensagem);
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(TelaClienteControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaClienteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void conexao(Mensagem mensagem) {
        View.getTextMsgEnviada().append(mensagem.getNome() + "\n");
    }

    private void desconectar(Mensagem mensagem) {

    }

    private void recebeMsg(Mensagem mensagem) {
  
    }

    private void mandaMsg(Mensagem mensagem) {

    }

    private void atualizaOnline(Mensagem mensagem) {

    }
}
