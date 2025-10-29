/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Cliente {
    
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    // Construtor
    public Cliente(String cpf, String nome, String endereco, String telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters e Setters
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // Exibir dados
    public void exibirCliente() {
        System.out.println("\n--- Dados do Cliente ---");
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }
}



 /* 
     A classe Cliente representa um cliente da oficina mecânica.
     Ela armazena informações básicas como CPF, nome, endereço, telefone e e-mail.
    

    package modelo; // Indica que esta classe está dentro do pacote "modelo"

    public class Cliente {

        // Atributos privados (encapsulamento) - apenas a própria classe pode acessá-los diretamente
        private String cpf;
        private String nome;
        private String endereco;
        private String telefone;
        private String email;

        /*
         Construtor da classe Cliente.
         Ele é executado quando criamos um novo objeto Cliente.
         Os parâmetros recebidos são usados para preencher os atributos.
        
        public Cliente(String cpf, String nome, String endereco, String telefone, String email) {
            this.cpf = cpf;                 // "this" diferencia o atributo do parâmetro
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
            this.email = email;
        }

        // Métodos Getters e Setters permitem acessar e alterar os atributos de forma segura

        public String getCpf() { return cpf; } // Retorna o CPF do cliente
        public void setCpf(String cpf) { this.cpf = cpf; } // Altera o CPF

        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public String getEndereco() { return endereco; }
        public void setEndereco(String endereco) { this.endereco = endereco; }

        public String getTelefone() { return telefone; }
        public void setTelefone(String telefone) { this.telefone = telefone; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        /*
         Método para exibir os dados do cliente na tela.
         Ele imprime no console todas as informações cadastradas.
        
        public void exibirCliente() {
            System.out.println("\n--- Dados do Cliente ---");
            System.out.println("CPF: " + cpf);
            System.out.println("Nome: " + nome);
            System.out.println("Endereço: " + endereco);
            System.out.println("Telefone: " + telefone);
            System.out.println("Email: " + email);
        }
    }
    */

