package Control;

import Model.Mensagem;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {

    private Socket soquete;
    private ObjectOutputStream saida;

    public Socket conexao() {
        try {
            this.soquete = new Socket("127.0.0.1", 15500);
             this.saida = new ObjectOutputStream(soquete.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soquete;
    }

    public void enviaMsg(Mensagem mensagem) {
        try {
            saida.writeObject(mensagem);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
