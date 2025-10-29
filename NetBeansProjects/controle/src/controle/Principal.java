/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controle;

import modelo.Cliente;
import modelo.Veiculo;
import java.util.Scanner; // ler entrada de texto

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==== CADASTRO DE CLIENTE ====");
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Endereço: ");
        String endereco = sc.nextLine();
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        Cliente c = new Cliente(cpf, nome, endereco, telefone, email);

        System.out.println("\n==== CADASTRO DE VEÍCULO ====");
        System.out.print("Placa: ");
        String placa = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Ano: ");
        int ano = sc.nextInt();
        sc.nextLine(); // Limpar buffer
        System.out.print("Fabricante: ");
        String fabricante = sc.nextLine();
        System.out.print("Cor: ");
        String cor = sc.nextLine();

        Veiculo v = new Veiculo(placa, modelo, ano, fabricante, cor);

        // Exibir dados cadastrados
        c.exibirCliente();
        v.exibirVeiculo();

        sc.close();
    }
}


    /*
     Classe Principal é responsável por iniciar o programa.
     Contém o método main, que é o ponto de entrada da aplicação.
     Aqui o usuário digita os dados, que são guardados nas classes modelo.


    package controle; // Pacote onde fica o main

    // Importamos as classes Cliente e Veiculo para poder usá-las aqui
    import modelo.Cliente;
    import modelo.Veiculo;

    // Import da classe Scanner para permitir entradas pelo teclado
    import java.util.Scanner;

    public class Principal {

        public static void main(String[] args) {

            // Criando um objeto Scanner para ler dados do teclado
            Scanner sc = new Scanner(System.in);

            // ===== CADASTRO DE CLIENTE =====
            System.out.println("==== CADASTRO DE CLIENTE ====");

            System.out.print("CPF: ");
            String cpf = sc.nextLine(); // Lê um texto digitado

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Endereço: ");
            String endereco = sc.nextLine();

            System.out.print("Telefone: ");
            String telefone = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            // Criamos um objeto Cliente usando os dados digitados
            Cliente c = new Cliente(cpf, nome, endereco, telefone, email);

            // ===== CADASTRO DE VEÍCULO =====
            System.out.println("\n==== CADASTRO DE VEÍCULO ====");

            System.out.print("Placa: ");
            String placa = sc.nextLine();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            System.out.print("Ano: ");
            int ano = sc.nextInt(); // Lê um número inteiro

            sc.nextLine(); // Limpa o buffer do scanner para evitar problemas ao ler texto depois

            System.out.print("Fabricante: ");
            String fabricante = sc.nextLine();

            System.out.print("Cor: ");
            String cor = sc.nextLine();

            // Criamos o objeto Veiculo com os dados digitados
            Veiculo v = new Veiculo(placa, modelo, ano, fabricante, cor);

            // Exibindo os dados cadastrados
            c.exibirCliente();
            v.exibirVeiculo();

            // Fechamos o Scanner, boa prática
            sc.close();
        }
    }
    */
