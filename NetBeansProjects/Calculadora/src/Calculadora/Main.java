/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculadora;

import java.util.Scanner;

/**
 *
 * @author Jeff 210017
 */
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        CalculadoraControle controle = new CalculadoraControle();

        System.out.println("Digite o primeiro número:");
        double n1 = entrada.nextDouble();

        System.out.println("Digite o segundo número:");
        double n2 = entrada.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = entrada.nextInt();

        Operacao operacaoEscolhida = null;

        switch (opcao) {
            case 1:
                operacaoEscolhida = new Soma();
                break;
            case 2:
                operacaoEscolhida = new Subtracao();
                break;
            case 3:
                operacaoEscolhida = new Multiplicacao();
                break;
            case 4:
                operacaoEscolhida = new Divisao();
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        double resultado = controle.executarOperacao(operacaoEscolhida, n1, n2);

        System.out.println("Resultado: " + resultado);
    }
}