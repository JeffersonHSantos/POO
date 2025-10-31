/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.upf.ads.desafio.front;

import br.upf.ads.desafio.model.CompraModel;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 210017
 */
public class CompraFront {
    // Atributo com a lista de compras em memória
    static ArrayList<CompraModel> lista = new ArrayList();
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("==== CADASTRO DE COMPRA ====");
        System.out.print("Código: ");
        Integer codigo = sc.nextInt();
        System.out.print("Produto: ");
        String nomeProduto = sc.next();
        System.out.print("Quantidade: ");
        Integer quantidade = sc.nextInt();
        System.out.print("Preço: ");
        Float preco = sc.nextFloat();
        
        CompraModel c = new CompraModel(codigo, nomeProduto, quantidade, preco);
        lista.add(c);
        
        
        
         System.out.println("====  COMPRA ====");
        System.out.println("codigo: " + c.getCodigo());
        System.out.println("Produto: " + c.getNomeProduto());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor do produto: " + preco);
        System.out.println("Valor Total: " + c.totalCompra() );
        System.out.println("Valor Com ICMS: " + c.totalIcms() );
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
    }

   
    
}
