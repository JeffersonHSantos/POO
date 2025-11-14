/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.montadora.app;

import br.edu.montadora.dominio.Carro;
import br.edu.montadora.dominio.Empresa;
import br.edu.montadora.dominio.Moto;
import br.edu.montadora.dominio.Motor;
import br.edu.montadora.dominio.Veiculo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 210017
 */
public class TestesPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Veiculo obj = new Carro();
        // fazer algo com obj...
        obj = new Moto();
        Carro c = new Carro(1);
        obj = c;
        Motor m = new Motor(2);
        //obj = m;
        obj.setMotor(m);
        Empresa e = new Empresa(3L);
        //obj = e;
        
        // Superclasse mãe de todas = object
        Object mae = c;
        mae = m;
        mae = e;
        mae = new Date();
        // também vale para coleções
        List<Object> listona = new ArrayList<>();
        listona.add(c);
        listona.add(m);
        listona.add(e);
        listona.add(new Date());
        listona.add("teste");
        
        for(Object o : listona){
            System.out.println(o);
            if (o instanceof Veiculo){
                
            }
                  
                    
                   
                    
                  
        }
        
    }
    
}
