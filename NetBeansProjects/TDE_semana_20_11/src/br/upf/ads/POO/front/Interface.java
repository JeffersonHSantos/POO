/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.upf.ads.POO.front;

import br.upf.ads.POO.model.Candidato;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jefferson H. Santos 210017
 */
public class Interface extends javax.swing.JFrame {
    
    ArrayList<Candidato> lista = new ArrayList<>();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Interface.class.getName());

        public Interface() {
        initComponents();
        
        
        cmbCargo.addItem("Selecione...");
        cmbEstado.addItem("Selecione...");
        cmbCargo.addItem("Presidente");
        cmbCargo.addItem("Governador");
        cmbCargo.addItem("Senador");
        cmbCargo.addItem("Deputado Federal");
        cmbCargo.addItem("Deputado Estadual");
        cmbEstado.addItem("AC");
        cmbEstado.addItem("AL");
        cmbEstado.addItem("AM");
        cmbEstado.addItem("AP");
        cmbEstado.addItem("BA");
        cmbEstado.addItem("CE");
        cmbEstado.addItem("DF");
        cmbEstado.addItem("ES");
        cmbEstado.addItem("GO");
        cmbEstado.addItem("MA");
        cmbEstado.addItem("MG");
        cmbEstado.addItem("MS");
        cmbEstado.addItem("MT");
        cmbEstado.addItem("PA");
        cmbEstado.addItem("PB");
        cmbEstado.addItem("PE");
        cmbEstado.addItem("PI");
        cmbEstado.addItem("PR");
        cmbEstado.addItem("RJ");
        cmbEstado.addItem("RN");
        cmbEstado.addItem("RO");
        cmbEstado.addItem("RR");
        cmbEstado.addItem("RS");
        cmbEstado.addItem("SC");
        cmbEstado.addItem("SE");
        cmbEstado.addItem("SP");
        cmbEstado.addItem("TO");
        
    }
        

        
    
    
        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtPartido = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        cmbEstado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        cmbCargo = new javax.swing.JComboBox<>();
        txtNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Partido:");

        jLabel4.setText("Cargo:");

        jLabel5.setText("Estado:");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Número", "Nome", "Partido", "Cargo", "Estado"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(txtNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(txtPartido))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInserir)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(btnListar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumero)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnListar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        
            // -------- VALIDAÇÃO DO NÚMERO --------
        String numeroStr = txtNumero.getText().trim();
        if (numeroStr.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O número do candidato é obrigatório!");
            return;
        }

        // -------- VALIDAÇÃO DO NOME --------
        if (txtNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O nome do candidato é obrigatório!");
            return;
        }

        // -------- VALIDAÇÃO DO PARTIDO --------
        if (txtPartido.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O partido é obrigatório!");
            return;
        }

        // -------- VALIDAÇÃO DO CARGO --------
        if (cmbCargo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Você deve selecionar um cargo!");
            return;
        }

        // -------- VALIDAÇÃO DO ESTADO --------
        if (cmbEstado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Você deve selecionar um estado!");
            return;
        }

        // -------- TUDO OK → CRIA O CANDIDATO --------
        Candidato c = new Candidato();
        c.setNumero( Integer.valueOf(txtNumero.getText()) );
        c.setNome(txtNome.getText());
        c.setPartido(txtPartido.getText());
        c.setCargo(cmbCargo.getSelectedItem().toString());
        c.setEstado(cmbEstado.getSelectedItem().toString());
        lista.add(c);
        JOptionPane.showMessageDialog(rootPane, "Incluído com sucesso.");
        btnListarActionPerformed(evt);
        limpar();
        
       
        
       
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        Object [][] dados = new Object [lista.size()][5];
        int lin = 0;
        for(Candidato c : lista) {
                dados [lin][0] = c.getNumero();
                dados [lin][1] = c.getNome();
                dados [lin][2] = c.getPartido();
                dados [lin][3] = c.getCargo();
                dados [lin][4] = c.getEstado();
                lin++;
        }
        
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            dados,
            new String [] {
                "Número", "Nome", "Partido", "Cargo", "Estado"
            }
        ));
        
        
        
        
        
        
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        Candidato excluir = new Candidato( Integer.valueOf(txtNumero.getText()) );
        lista.remove(excluir);
        JOptionPane.showMessageDialog(rootPane, "Excluido com sucesso.");
        btnListarActionPerformed(evt);
        limpar();  
     
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        
        
        int selecionada = tabela.getSelectedRow();
        Candidato objeto = lista.get(selecionada);
        txtNumero.setText(objeto.getNumero().toString());
        txtNome.setText(objeto.getNome());
        txtPartido.setText(objeto.getPartido());
        cmbCargo.setSelectedItem(objeto.getCargo());
        cmbEstado.setSelectedItem(objeto.getEstado());
        
        
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        
        Candidato alterar = new Candidato( Integer.valueOf (txtNumero.getText()) );
        Candidato objeto = lista.get(lista.indexOf(alterar));
        objeto.setNome(txtNome.getText());
        objeto.setPartido(txtPartido.getText());
        objeto.setCargo(cmbCargo.getSelectedItem().toString());
        objeto.setEstado(cmbEstado.getSelectedItem().toString());
        JOptionPane.showMessageDialog(rootPane, "Alterado com sucesso.");
        btnListarActionPerformed(evt);        
        limpar();
  
    }//GEN-LAST:event_btnAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new Interface().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnListar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPartido;
    // End of variables declaration//GEN-END:variables

    private void limpar(){
        txtNumero.setText("");
        txtNome.setText("");
        txtPartido.setText("");
        cmbCargo.setSelectedIndex(0);
        cmbEstado.setSelectedIndex(0);
    }

}
