/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.upf.ads210017.front;

import br.upf.ads210017.model.Reserva;
import br.upf.ads210017.model.ReservaEvento;
import br.upf.ads210017.model.ReservaHotel;
import java.util.ArrayList;

/**
 *
 * @author 210017
 */
public class Main {
    private static final ArrayList<Reserva> reserva = new ArrayList<>();
    
    
    public static void main(String[] args) {
        
        
        Reserva r1, r2, r3;
        r1 = new ReservaHotel();
        r2 = new ReservaHotel();
        r3 = new ReservaEvento();
        r1.setCodigo(1);
        r2.setCodigo(2);
        r3.setCodigo(3);
        
        r1.setNumeroDiarias(3);
        r1.setValorDiaria(300f);
        
        
        
        
        
        
               
            
        
    }
    
}
