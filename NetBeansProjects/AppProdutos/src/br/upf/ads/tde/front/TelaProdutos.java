package br.upf.ads.tde.front;

import br.upf.ads.tde.dominio.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Tela Desktop para gerenciamento de Produtos
 * Implementa operações CRUD em memória
 * @author TDE Semana 20/11/2025
 */
public class TelaProdutos extends javax.swing.JFrame {
    
    // Lista em memória para armazenar os produtos
    private ArrayList<Produto> lista = new ArrayList<>();
    
    /**
     * Construtor da tela
     */
    public TelaProdutos() {
        initComponents();
        setLocationRelativeTo(null); // Centralizar a janela
        setTitle("Sistema de Gerenciamento de Produtos");
    }
    
    /**
     * Método para limpar os campos do formulário
     */
    private void limpar() {
        txtCodigo.setText("");
        txtNome.setText("");
        txtCategoria.setText("");
        txtPreco.setText("");
        txtCodigo.requestFocus();
    }
    
    /**
     * Método para atualizar a tabela com os dados da lista
     */
    private void listar() {
        // Criar matriz de dados
        Object[][] dados = new Object[lista.size()][4];
        
        // Preencher matriz com dados da lista
        int linha = 0;
        for (Produto p : lista) {
            dados[linha][0] = p.getCodigo();
            dados[linha][1] = p.getNome();
            dados[linha][2] = p.getCategoria();
            dados[linha][3] = String.format("R$ %.2f", p.getPreco());
            linha++;
        }
        
        // Cabeçalhos das colunas
        String[] colunas = {"Código", "Nome", "Categoria", "Preço"};
        
        // Atualizar modelo da tabela
        tabela.setModel(new DefaultTableModel(dados, colunas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Tornar células não editáveis
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Produto"));

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Categoria:");

        jLabel4.setText("Preço:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreco))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnListar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Categoria", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    /**
     * Ação do botão Inserir
     */
    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            // Criar novo produto com dados do formulário
            Produto produto = new Produto(
                Integer.parseInt(txtCodigo.getText()),
                txtNome.getText(),
                txtCategoria.getText(),
                Double.parseDouble(txtPreco.getText())
            );
            
            // Verificar se produto já existe
            if (lista.contains(produto)) {
                JOptionPane.showMessageDialog(this, 
                    "Produto com código " + produto.getCodigo() + " já existe!", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Adicionar na lista
            lista.add(produto);
            
            // Mostrar mensagem de sucesso
            JOptionPane.showMessageDialog(this, 
                "Produto inserido com sucesso!", 
                "Sucesso", 
                JOptionPane.INFORMATION_MESSAGE);
            
            // Atualizar tabela e limpar formulário
            listar();
            limpar();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                "Código e Preço devem ser valores numéricos válidos!", 
                "Erro de Validação", 
                JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, 
                e.getMessage(), 
                "Erro de Validação", 
                JOptionPane.ERROR_MESSAGE);
        }
    }                                          

    /**
     * Ação do botão Alterar
     */
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            // Criar produto com código a ser alterado
            Produto produtoAlterar = new Produto(Integer.parseInt(txtCodigo.getText()));
            
            // Buscar índice do produto na lista
            int indice = lista.indexOf(produtoAlterar);
            
            if (indice == -1) {
                JOptionPane.showMessageDialog(this, 
                    "Produto não encontrado!", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Obter produto da lista
            Produto produto = lista.get(indice);
            
            // Alterar dados do produto
            produto.setNome(txtNome.getText());
            produto.setCategoria(txtCategoria.getText());
            produto.setPreco(Double.parseDouble(txtPreco.getText()));
            
            // Mostrar mensagem de sucesso
            JOptionPane.showMessageDialog(this, 
                "Produto alterado com sucesso!", 
                "Sucesso", 
                JOptionPane.INFORMATION_MESSAGE);
            
            // Atualizar tabela e limpar formulário
            listar();
            limpar();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                "Código e Preço devem ser valores numéricos válidos!", 
                "Erro de Validação", 
                JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, 
                e.getMessage(), 
                "Erro de Validação", 
                JOptionPane.ERROR_MESSAGE);
        }
    }                                          

    /**
     * Ação do botão Excluir
     */
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            // Criar produto com código a ser excluído
            Produto produto = new Produto(Integer.parseInt(txtCodigo.getText()));
            
            // Verificar se produto existe
            if (!lista.contains(produto)) {
                JOptionPane.showMessageDialog(this, 
                    "Produto não encontrado!", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Confirmar exclusão
            int confirmacao = JOptionPane.showConfirmDialog(this, 
                "Deseja realmente excluir o produto código " + produto.getCodigo() + "?", 
                "Confirmar Exclusão", 
                JOptionPane.YES_NO_OPTION);
            
            if (confirmacao == JOptionPane.YES_OPTION) {
                // Remover da lista
                lista.remove(produto);
                
                // Mostrar mensagem de sucesso
                JOptionPane.showMessageDialog(this, 
                    "Produto excluído com sucesso!", 
                    "Sucesso", 
                    JOptionPane.INFORMATION_MESSAGE);
                
                // Atualizar tabela e limpar formulário
                listar();
                limpar();
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                "Código deve ser um valor numérico válido!", 
                "Erro de Validação", 
                JOptionPane.ERROR_MESSAGE);
        }
    }                                          

    /**
     * Ação do botão Listar
     */
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        listar();
    }                                         

    /**
     * Ação ao clicar na tabela - carregar dados no formulário
     */
    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // Obter linha selecionada
        int linhaSelecionada = tabela.getSelectedRow();
        
        if (linhaSelecionada >= 0) {
            // Obter produto da lista
            Produto produto = lista.get(linhaSelecionada);
            
            // Preencher formulário com dados do produto
            txtCodigo.setText(String.valueOf(produto.getCodigo()));
            txtNome.setText(produto.getNome());
            txtCategoria.setText(produto.getCategoria());
            txtPreco.setText(String.valueOf(produto.getPreco()));
        }
    }                                   

    /**
     * Método main para iniciar a aplicação
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration                   
}
