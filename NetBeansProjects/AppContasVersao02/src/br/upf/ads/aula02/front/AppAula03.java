/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.upf.ads.aula02.front;

import br.upf.ads.aula02.model.Conta;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jaqson
 */
public class AppAula03 {
    // Atributo com a lista de contas em memória
    static ArrayList<Conta> lista = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String opcao = "";
       // Ficar repetindo os passo abaixo até sair 
       while (opcao.equals("Sair") == false ) {
          // Mostrar menu de opções para usuário
          String[] opcoes = {"Incluir", "Alterar",
                           "Excluir", "Listar",
                           "Sair" };
          int escolha = JOptionPane.showOptionDialog(
                  null, "Escolha algo", "Menu", 
                  0, 0, null, opcoes, null);
          // Ler a opção
          opcao = opcoes[escolha]; 
          // Testar a opção informada
           switch (opcao) {
               case "Incluir":
                   incluir();
                   break;
               case "Alterar":
                   alterar();
                   break;
               case "Excluir":
                   excluir();
                   break;
               case "Listar":
                   listar();
                   break;
               
           }
          // Encaminhar fluxo para operação respectiva
          // A operação faz o que o usuário pediu
       }
   
        
        
        
        
        
    }

    private static void incluir() {
        System.out.println("incluir...");
        Conta c = new Conta();
        c.setNumero(
          Integer.valueOf(
            JOptionPane.showInputDialog("Número")
          )
        );
        c.setTitular(
           JOptionPane.showInputDialog("Titular")
        );
        // objeto pronto, guardar na lista
        lista.add(c);
    }

    private static void alterar() {
        System.out.println("alterar...");
        // Ler qual conta deseja alterar
        Integer numero = Integer.valueOf(
            JOptionPane.showInputDialog("Número")
        );
        // instanciar uma conta com o número lido
        Conta buscar = new Conta(numero);
        // recuperar o objeto da lista = precisa substituir equals na classe
        int posicao = lista.indexOf(buscar);
        if (posicao >= 0){
            Conta alterar = lista.get(posicao);
            alterar.setTitular(
               JOptionPane.showInputDialog("Titular", alterar.getTitular())
            );
            JOptionPane.showMessageDialog(null, "Alterado com sucesso.");
        } else
            JOptionPane.showMessageDialog(null, "Não encontrado.");          
    }

    private static void excluir() {
        System.out.println("excluir...");  
        // Ler qual conta deseja excluir
        Integer numero = Integer.valueOf(
            JOptionPane.showInputDialog("Número")
        );
        // instanciar uma conta com o número lido
        Conta remover = new Conta(numero);
        // remover um objeto da lista = precisa substituir equals na classe
        if (lista.remove(remover) == true)
            JOptionPane.showMessageDialog(null, "Removido com sucesso.");
        else
            JOptionPane.showMessageDialog(null, "Não encontrado.");
            
    }

    private static void listar() {
        System.out.println("listar...");
        // percorrer a lista e mostrar os dados
        for (Conta c : lista){
            System.out.println(
               c.getNumero()+" - "+
               c.getTitular()+" - "+
               c.getSaldo()
            ); 
        }
        
        DialogoTabela dialogo = new DialogoTabela(null, lista);
        dialogo.setVisible(true);
        
        
    }
    
    
    // Classe interna para o JDialog personalizado
    static class DialogoTabela extends JDialog {
        // construtor para inicializações do diálogo
        public DialogoTabela(JFrame parent, ArrayList<Conta> lista) {
            super(parent, "Listagem de Contas", true); // 'true' para torná-lo modal
            setSize(400, 250);
            setLocationRelativeTo(parent); // Centraliza em relação ao JFrame pai
            // 1. Definir a matriz com os dados obtidos da coleção
            //    linhas = tamanho da lista, colunas = quantidade de cabeçalhos
            String[] cabecalhos = {"Número", "Titular"};
            Object[][] dados = new Object[lista.size()][cabecalhos.length];
            int lin = 0;
            for (Conta c : lista){
                dados[lin][0] = c.getNumero();
                dados[lin][1] = c.getTitular();
                lin++;
            }                        
            // 2. Criar o DefaultTableModel (modelo padrão para a tabela)
            DefaultTableModel model = new DefaultTableModel(dados, cabecalhos);
            // 3. Criar a JTable com o modelo
            JTable tabela = new JTable(model);
            // 4. Envolver a JTable em um JScrollPane para adicionar rolagem e cabeçalho
            JScrollPane scrollPane = new JScrollPane(tabela);
            // 5. Adicionar o JScrollPane com a tabela ao JDialog
            // Usar BorderLayout para um layout simples
            setLayout(new BorderLayout());
            add(scrollPane, BorderLayout.CENTER);
            // Botão de fechar (opcional)
            JButton btnFechar = new JButton("Fechar");
            btnFechar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose(); // Fecha o diálogo
                }
            });
            // Adiciona o botão a um painel para melhor posicionamento
            JPanel painel_inferior = new JPanel();
            painel_inferior.add(btnFechar);
            add(painel_inferior, BorderLayout.SOUTH);
        }
    }    
    
    
}
