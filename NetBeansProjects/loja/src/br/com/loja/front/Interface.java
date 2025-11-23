/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.loja.front;

import br.com.loja.model.Produto;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Interface extends JFrame {

    private final JTextField tfId = new JTextField(10);
    private final JTextField tfNome = new JTextField(20);
    private final JTextField tfPreco = new JTextField(10);
    private final JTextField tfQuantidade = new JTextField(10);

    private final JButton btnInserir = new JButton("Inserir");
    private final JButton btnAlterar = new JButton("Alterar");
    private final JButton btnExcluir = new JButton("Excluir");
    private final JButton btnListar = new JButton("Listar");

    private final DefaultTableModel tableModel =
            new DefaultTableModel(new Object[]{"ID", "Nome", "Preço", "Quantidade"}, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

    private final JTable table = new JTable(tableModel);

    private final List<Produto> lista = new ArrayList<>();

    public Interface() {
        super("Cadastro de Produto - Exemplo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        buildForm();
        buildTable();
        bindActions();

        pack();
        setLocationRelativeTo(null);
    }

    private void buildForm() {
        JPanel form = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 4, 4, 4);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        form.add(new JLabel("ID:"), gbc);
        gbc.gridx = 1;
        form.add(tfId, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        form.add(new JLabel("Nome:"), gbc);
        gbc.gridx = 1;
        form.add(tfNome, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        form.add(new JLabel("Preço:"), gbc);
        gbc.gridx = 1;
        form.add(tfPreco, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        form.add(new JLabel("Quantidade:"), gbc);
        gbc.gridx = 1;
        form.add(tfQuantidade, gbc);

        JPanel buttons = new JPanel();
        buttons.add(btnInserir);
        buttons.add(btnAlterar);
        buttons.add(btnExcluir);
        buttons.add(btnListar);

        JPanel north = new JPanel(new BorderLayout());
        north.add(form, BorderLayout.CENTER);
        north.add(buttons, BorderLayout.SOUTH);

        add(north, BorderLayout.NORTH);
    }

    private void buildTable() {
        JScrollPane scroll = new JScrollPane(table);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(scroll, BorderLayout.CENTER);

        table.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            int sel = table.getSelectedRow();
            if (sel >= 0) {
                tfId.setText(tableModel.getValueAt(sel, 0).toString());
                tfNome.setText(tableModel.getValueAt(sel, 1).toString());
                tfPreco.setText(tableModel.getValueAt(sel, 2).toString());
                tfQuantidade.setText(tableModel.getValueAt(sel, 3).toString());
            }
        });
    }

    private void bindActions() {

        btnInserir.addActionListener((ActionEvent e) -> {
            try {
                Produto p = readFromForm();
                Optional<Produto> exists = lista.stream()
                        .filter(x -> x.getId().equals(p.getId()))
                        .findFirst();

                if (exists.isPresent()) {
                    JOptionPane.showMessageDialog(this, "ID já existe!", "Atenção", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                lista.add(p);
                refreshTable();
                clearForm();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao inserir: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnAlterar.addActionListener((ActionEvent e) -> {
            try {
                Produto p = readFromForm();

                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getId().equals(p.getId())) {
                        lista.set(i, p);
                        refreshTable();
                        clearForm();
                        return;
                    }
                }

                JOptionPane.showMessageDialog(this, "Produto não encontrado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao alterar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnExcluir.addActionListener((ActionEvent e) -> {
            int sel = table.getSelectedRow();

            if (sel >= 0) {
                Long id = Long.parseLong(tableModel.getValueAt(sel, 0).toString());
                lista.removeIf(p -> p.getId().equals(id));
                refreshTable();
                clearForm();
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um item para excluir!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        });

        btnListar.addActionListener((ActionEvent e) -> refreshTable());
    }

    private Produto readFromForm() {
        Long id = Long.parseLong(tfId.getText().trim());
        String nome = tfNome.getText().trim();
        double preco = Double.parseDouble(tfPreco.getText().trim());
        int qtd = Integer.parseInt(tfQuantidade.getText().trim());
        return new Produto(id, nome, preco, qtd);
    }

    private void refreshTable() {
        tableModel.setRowCount(0);

        for (Produto p : lista) {
            tableModel.addRow(new Object[]{
                    p.getId(),
                    p.getNome(),
                    p.getPreco(),
                    p.getQuantidade()
            });
        }
    }

    private void clearForm() {
        tfId.setText("");
        tfNome.setText("");
        tfPreco.setText("");
        tfQuantidade.setText("");
        table.clearSelection();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Interface frame = new Interface();
            frame.setVisible(true);
        });
    }
}
