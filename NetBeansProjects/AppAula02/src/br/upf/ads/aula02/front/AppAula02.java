/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.upf.ads.aula02.front;

import br.upf.ads.aula02.model.Conta;

/**
 *
 * @author 210017
 */
public class AppAula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c1 = new Conta(); // Conta é classe, c1 é objeto, new é ??? e conta é o contrutor.
        c1.setNumero(1);
        c1.setTitular("Jeff");
        //c1.saldo = 1000f;
        c1.depositar(1000f);
        
        Conta c2 = new Conta(-2, "Bruna");
        c2.depositar(2000f);
        
        
                
    }
    
}
