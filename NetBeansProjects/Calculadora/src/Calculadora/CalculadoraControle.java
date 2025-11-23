/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author Jeff
 */
public class CalculadoraControle {

    public double executarOperacao(Operacao op, double a, double b) {
        return op.calcular(a, b);
    }
}

