/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.Scanner;
import model.Medidas;

/**
 * Classe principal que executa o programa.
 * Aqui o usuário informa as medidas e o programa calcula o volume em m³.
 */


public class Obra {
    
    // Lista que armazena todos os objetos do tipo Medidas.
    // Permite guardar várias medidas, caso o usuário queira calcular mais de uma vez.
    static ArrayList<Medidas> lista = new ArrayList();
    public static void main(String[] args) {
        
        // Scanner usado para receber dados digitados pelo usuário no teclado.
        Scanner sc = new Scanner(System.in);
        
        // Entrada de dados: o usuário informa base, altura e comprimento.
        System.out.println("==== Cálculo de Metros cúbicos ====");
        System.out.print("Base: ");
        Double base = sc.nextDouble();
        System.out.print("Altura: ");
        Double altura = sc.nextDouble();
        System.out.print("Comprimento: ");
        Double comprimento = sc.nextDouble();
        
        
        // Criação do objeto "m" do tipo Medidas passando os valores informados.
        // Esses valores serão enviados para o construtor da classe Medidas.
        Medidas m = new Medidas(base, altura, comprimento);
        lista.add(m);
        
        // Chamada do método que calcula os metros cúbicos (m³) e exibe o resultado.
        System.out.println("====  TOTAL ====");
        System.out.println("Metros cúbicos: " + m.calcularM3());
        
        // Feche o scanner 
        sc.close();
          
    }
    
}
