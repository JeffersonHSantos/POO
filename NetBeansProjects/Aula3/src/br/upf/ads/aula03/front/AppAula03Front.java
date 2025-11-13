/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.upf.ads.aula03.front;

import br.upf.ads.aula03.model.Conta;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 210017
 */
public class AppAula03Front {
    // Atributo com a lista de contas em memória
    static ArrayList<Conta> lista = new ArrayList();

    
    public static void main(String[] args) {
        
        
        String opcao = "";
       
        // Ficar repetindo os passos abaixo até sair
        while (opcao.equals("Sair") == false) {
        
        // Mostrar menu de opções para usuário
           String[] opcoes = {"Incluir","Alterar","Excluir","Listar","Sair"}; // criar um vetor para escolha
           
           int escolha = JOptionPane.showOptionDialog(null, "Escolha a Opção: ", "Menu", 0, 0, null, opcoes, null);
           
           opcao = opcoes[escolha];
           
        // Ler a opção
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
        
        
        // Testar a opção informada
        // Encaminhar fluxo para operação respectiva
        // A operação faz o que o usuário pediu
        }         
    }

    private static void incluir() {
        System.out.println("incluir...");
        Conta c = new Conta(); // contrutor
        c.setNumero(
            Integer.valueOf(
                JOptionPane.showInputDialog("Número")
            )
        );
        c.setTitular(JOptionPane.showInputDialog("Titular"));
        // Objeto pronto, guardar na lista
        
        lista.add(c);
    }

    private static void alterar() {
        System.out.println("alterar...");
    }

    private static void excluir() {
        System.out.println("excluir...");
        // Ler qual conta deseja excluir
        // Remover da lista a conta lida
        
        
        
        // Para remover um objeto da lista
        // opcao 1 = pelo indice
        lista.remove(0); //
        lista.remove(1);
        int pos = 3;
        lista.remove(pos);
        
    }

    private static void listar() {
        System.out.println("listar...");
        // Percorrer a lista e mostrar os dados
        
        for (Conta c : lista) {      // for each
            System.out.println(
               c.getNumero()+" - "+
               c.getTitular()+" - "+
               c.getSaldo()
            );
        }
    }
    
}
