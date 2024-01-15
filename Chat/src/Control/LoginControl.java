package Control;

import Model.Mensagem;
import View.TelaCliente;
import java.net.Socket;
import javax.swing.JOptionPane;

public class LoginControl {

    private TelaCliente View;
    private Socket soquete;
    private Mensagem mensagem;
    private Cliente cliente;

    public LoginControl(TelaCliente View) {
        this.View = View;
    }

    public void verificaLogin() {
        String nome = View.getTextNome().getText();
        if (!nome.isEmpty()) {
            this.mensagem = new Mensagem();
            this.mensagem.setAcoesUser(Mensagem.Action.conectar);
            this.mensagem.setNome(nome);

            if (this.soquete == null) {
                this.cliente = new Cliente();
                this.soquete = this.cliente.conexao();
                new Thread(new TelaClienteControl(this.soquete)).start();
            }
            this.cliente.enviaMsg(mensagem);
        } else {
            JOptionPane.showMessageDialog(null, "Digite um nome válido", "Preencha o campo corretamente.", JOptionPane.WARNING_MESSAGE);

        }
    }
}
