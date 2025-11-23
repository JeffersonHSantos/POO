package br.upf.ads.tde.front;

import br.upf.ads.tde.dominio.Produto;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class TelaProdutos extends JFrame {
    private JTextField tfId;
    private JTextField tfNome;
    private JTextField tfPreco;
    private JTextField tfQuantidade;
    private JButton btInserir;
    private JButton btAlterar;
    private JButton btExcluir;
    private JButton btListar;
    private JTable table;
    private DefaultTableModel model;
    private List<Produto> lista;

    public TelaProdutos() {
        lista = new ArrayList<>();
        setTitle("Gestão de Produtos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 400);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        JPanel panelForm = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6,6,6,6);
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelForm.add(new JLabel("ID"), gbc);
        gbc.gridx = 1;
        tfId = new JTextField(10);
        panelForm.add(tfId, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panelForm.add(new JLabel("Nome"), gbc);
        gbc.gridx = 1;
        tfNome = new JTextField(20);
        panelForm.add(tfNome, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panelForm.add(new JLabel("Preço"), gbc);
        gbc.gridx = 1;
        tfPreco = new JTextField(10);
        panelForm.add(tfPreco, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panelForm.add(new JLabel("Quantidade"), gbc);
        gbc.gridx = 1;
        tfQuantidade = new JTextField(10);
        panelForm.add(tfQuantidade, gbc);

        btInserir = new JButton("Inserir");
        btAlterar = new JButton("Alterar");
        btExcluir = new JButton("Excluir");
        btListar = new JButton("Listar");

        JPanel panelBotoes = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelBotoes.add(btInserir);
        panelBotoes.add(btAlterar);
        panelBotoes.add(btExcluir);
        panelBotoes.add(btListar);

        model = new DefaultTableModel(new Object[]{"ID","Nome","Preço","Quantidade"}, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scroll = new JScrollPane(table);

        Container ct = getContentPane();
        ct.setLayout(new BorderLayout());
        ct.add(panelForm, BorderLayout.NORTH);
        ct.add(panelBotoes, BorderLayout.CENTER);
        ct.add(scroll, BorderLayout.SOUTH);

        btInserir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inserirProduto();
            }
        });

        btListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarTabela();
            }
        });

        btExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                excluirProduto();
            }
        });

        btAlterar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alterarProduto();
            }
        });

        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                preencherFormularioPorSelecao();
            }
        });
    }

    private void inserirProduto() {
        try {
            Produto p = lerFormulario();
            for(Produto q : lista) {
                if(q.equals(p)) {
                    JOptionPane.showMessageDialog(this, "ID já existe");
                    return;
                }
            }
            lista.add(p);
            atualizarTabela();
            limparFormulario();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
        }
    }

    private void alterarProduto() {
        int sel = table.getSelectedRow();
        if(sel < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um produto");
            return;
        }
        try {
            Produto p = lerFormulario();
            Produto antigo = lista.get(sel);
            if(antigo.getId() != p.getId()) {
                for(Produto q : lista) {
                    if(q.equals(p)) {
                        JOptionPane.showMessageDialog(this, "ID já existe");
                        return;
                    }
                }
            }
            lista.set(sel, p);
            atualizarTabela();
            limparFormulario();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
        }
    }

    private void excluirProduto() {
        int sel = table.getSelectedRow();
        if(sel < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um produto");
            return;
        }
        lista.remove(sel);
        atualizarTabela();
        limparFormulario();
    }

    private void atualizarTabela() {
        model.setRowCount(0);
        for(Produto p : lista) {
            model.addRow(new Object[]{p.getId(), p.getNome(), p.getPreco(), p.getQuantidade()});
        }
    }

    private Produto lerFormulario() {
        int id = Integer.parseInt(tfId.getText().trim());
        String nome = tfNome.getText().trim();
        double preco = Double.parseDouble(tfPreco.getText().trim());
        int qtd = Integer.parseInt(tfQuantidade.getText().trim());
        Produto p = new Produto(id, nome, preco, qtd);
        return p;
    }

    private void preencherFormularioPorSelecao() {
        int sel = table.getSelectedRow();
        if(sel >= 0) {
            tfId.setText(String.valueOf(model.getValueAt(sel, 0)));
            tfNome.setText(String.valueOf(model.getValueAt(sel, 1)));
            tfPreco.setText(String.valueOf(model.getValueAt(sel, 2)));
            tfQuantidade.setText(String.valueOf(model.getValueAt(sel, 3)));
        }
    }

    private void limparFormulario() {
        tfId.setText("");
        tfNome.setText("");
        tfPreco.setText("");
        tfQuantidade.setText("");
        table.clearSelection();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TelaProdutos t = new TelaProdutos();
                t.setVisible(true);
            }
        });
    }
}
