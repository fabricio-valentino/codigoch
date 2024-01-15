package Control;

import Model.Mensagem;
import Model.Mensagem.Action;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrataCliente {

    private ServerSocket soquete_servidor;
    private Socket soquete;
    private ArrayList<String> clientesOnlines;

    public TrataCliente() {
        try {
            soquete_servidor = new ServerSocket(15500);
            //enquanto o servidor estiver rodando...
            while (true) {
                //aceita a conexao
                soquete = soquete_servidor.accept();

                new Thread(new ExecutaSoquete(soquete)).start();
            }
        } catch (Exception e) {
        }
    }

    private class ExecutaSoquete implements Runnable {

        private ObjectOutputStream saida;
        private ObjectInputStream entrada;

        public ExecutaSoquete(Socket soquete) throws IOException {
            this.saida = new ObjectOutputStream(soquete.getOutputStream());
            this.entrada = new ObjectInputStream(soquete.getInputStream());
        }

        @Override
        public void run() {
            try {
                Mensagem mensagem = null;
                //o (Mensagem) significa que estamos convertendo a variavel mensagem em um tipo Mensagem
                while ((mensagem = (Mensagem) entrada.readObject()) != null) {
                    Action acaoUsuario = mensagem.getAcoesUser();
                    if (acaoUsuario.equals(Action.conectar)) {
                        Conexao(mensagem, saida);
                    } else if (acaoUsuario.equals(Action.desconectar)) {

                    } else if (acaoUsuario.equals(Action.recebeMsg)) {

                    } else if (acaoUsuario.equals(Action.mandaMsg)) {

                    } else if (acaoUsuario.equals(Action.online)) {

                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(TrataCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TrataCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        private void Conexao(Mensagem mensagem, ObjectOutputStream saida) {
            MandaMsgUm(mensagem, saida);
        }

        private void MandaMsgUm(Mensagem mensagem, ObjectOutputStream saida) {
            try {
                saida.writeObject(mensagem);
            } catch (IOException ex) {

            }
        }
    }

}
