package View;

import Control.LoginControl;
import Control.TelaClienteControl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaCliente extends javax.swing.JFrame {

    private TelaClienteControl Control;
    private ObjectInputStream entrada;

    public TelaCliente() {
        iniciarTelaClienteControl();
        initComponents();

    }

    private void iniciarTelaClienteControl() {
        try {
        Socket soquete = new Socket("127.0.0.1", 15500);
            Control = new TelaClienteControl(soquete);
            this.entrada = new ObjectInputStream(soquete.getInputStream());
       
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        textMsgEnviada = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonEnviarf = new javax.swing.JButton();
        buttonEnviar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textMsg = new javax.swing.JTextArea();
        buttonLimpar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        buttonEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaUsuarios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaUsuarios);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 180, 320));

        textMsgEnviada.setColumns(20);
        textMsgEnviada.setRows(5);
        jScrollPane2.setViewportView(textMsgEnviada);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 320, 140));

        jLabel2.setText("ENVIE MENSAGENS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel3.setText("USUÁRIOS CONECTADOS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel4.setText("DIGITE SEU NOME E CONECTE-SE!");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        buttonSair.setBackground(new java.awt.Color(255, 102, 102));
        buttonSair.setText("SAIR");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, -1, -1));

        buttonEnviarf.setBackground(new java.awt.Color(102, 102, 255));
        buttonEnviarf.setText("ATUALIZAR");
        buttonEnviarf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnviarfActionPerformed(evt);
            }
        });
        jPanel2.add(buttonEnviarf, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, -1, -1));

        buttonEnviar.setBackground(new java.awt.Color(153, 255, 153));
        buttonEnviar.setText("ENVIAR");
        buttonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnviarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, -1, -1));

        textMsg.setColumns(20);
        textMsg.setRows(5);
        jScrollPane3.setViewportView(textMsg);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 330, 120));

        buttonLimpar.setBackground(new java.awt.Color(255, 255, 153));
        buttonLimpar.setText("LIMPAR");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });
        jPanel2.add(buttonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, -1, -1));

        jLabel5.setText("MENSAGENS ENVIADAS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        textNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(textNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 170, -1));

        buttonEntrar.setText("ENTRAR");
        buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void buttonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEnviarActionPerformed

    private void buttonEnviarfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnviarfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEnviarfActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarActionPerformed
        LoginControl log = new LoginControl(this);
        log.verificaLogin();
    }//GEN-LAST:event_buttonEntrarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEntrar;
    private javax.swing.JButton buttonEnviar;
    private javax.swing.JButton buttonEnviarf;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaUsuarios;
    private javax.swing.JTextArea textMsg;
    private javax.swing.JTextArea textMsgEnviada;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables

    public JButton getButtonAtualiza() {
        return buttonEnviarf;
    }

    public void setButtonAtualiza(JButton buttonAtualiza) {
        this.buttonEnviarf = buttonAtualiza;
    }

    public JButton getButtonEnviar() {
        return buttonEnviar;
    }

    public void setButtonEnviar(JButton buttonEnviar) {
        this.buttonEnviar = buttonEnviar;
    }

    public JButton getButtonLimpar() {
        return buttonLimpar;
    }

    public void setButtonLimpar(JButton buttonLimpar) {
        this.buttonLimpar = buttonLimpar;
    }

    public JButton getButtonSair() {
        return buttonSair;
    }

    public void setButtonSair(JButton buttonSair) {
        this.buttonSair = buttonSair;
    }

    public JList<String> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(JList<String> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public JTextArea getTextMsg() {
        return textMsg;
    }

    public void setTextMsg(JTextArea textMsg) {
        this.textMsg = textMsg;
    }

    public JTextArea getTextMsgEnviada() {
        return textMsgEnviada;
    }

    public void setTextMsgEnviada(JTextArea textMsgEnviada) {
        this.textMsgEnviada = textMsgEnviada;
    }

    public JButton getButtonEntrar() {
        return buttonEntrar;
    }

    public void setButtonEntrar(JButton buttonEntrar) {
        this.buttonEntrar = buttonEntrar;
    }

    public JButton getButtonEnviarf() {
        return buttonEnviarf;
    }

    public void setButtonEnviarf(JButton buttonEnviarf) {
        this.buttonEnviarf = buttonEnviarf;
    }

    public JTextField getTextNome() {
        return textNome;
    }

    public void setTextNome(JTextField textNome) {
        this.textNome = textNome;
    }
}
