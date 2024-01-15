package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Mensagem implements Serializable {

    private String nome;
    private String texto;
    private String nomePrivado;
    private ArrayList<String> clientesOnlines  = new ArrayList<>();
    private Action acoesUser;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getNomePrivado() {
        return nomePrivado;
    }

    public void setNomePrivado(String nomePrivado) {
        this.nomePrivado = nomePrivado;
    }

    public ArrayList<String> getClientesOnlines() {
        return clientesOnlines;
    }

    public void setClientesOnlines(ArrayList<String> clientesOnlines) {
        this.clientesOnlines = clientesOnlines;
    }

    public Action getAcoesUser() {
        return acoesUser;
    }

    public void setAcoesUser(Action acoesUser) {
        this.acoesUser = acoesUser;
    }
    //qual acao o cliente deseja realizar?
    public enum Action{
        conectar, desconectar, recebeMsg, mandaMsg, online
    }
}
