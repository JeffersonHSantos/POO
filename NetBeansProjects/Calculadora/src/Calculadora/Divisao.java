/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author Jeff
 */
public class Divisao implements Operacao {
    @Override
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida.");
        }
        return a / b;
    }
}

