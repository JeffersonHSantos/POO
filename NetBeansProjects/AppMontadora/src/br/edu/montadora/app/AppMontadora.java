package br.edu.montadora.app;

import br.edu.montadora.dominio.*;
import java.util.*;

public class AppMontadora {
    public static void main(String[] args) {
        List<Motor> motores = new ArrayList<>();
        List<Cidade> cidades = new ArrayList<>();
        List<Empresa> empresas = new ArrayList<>();
        List<Veiculo> veiculos = new ArrayList<>();

        // Criando e adicionando cidades na lista
        Cidade c1 = new Cidade(1L, "São Paulo", "SP");
        cidades.add(c1);
        Cidade c2 = new Cidade(2L, "Curitiba", "PR");
        cidades.add(c2);
        Cidade c3 = new Cidade(3L, "Porto Alegre", "RS");
        cidades.add(c2);
        
        // Criando e adicionando empresas na lista
        Empresa e1 = new Empresa(1L, "MotoPeças Ltda.", "99.999.999/0001-99", c1);
        Empresa e2 = new Empresa(2L, "Motores SA", "99.999.999/0001-99", c2);
        Empresa e3 = new Empresa(3L, "AutoFornecedores", "99.999.999/0001-99", c3);
        empresas.addAll(Arrays.asList(e1, e2, e3));

        Motor m1 = new Motor(1, "MTR-100", 4);
        Motor m2 = new Motor(2, "MTR-200", 6);
        Motor m3 = new Motor(3, "MTR-50", 2);
        motores.addAll(Arrays.asList(m1, m2));

        Carro carro = new Carro(4, 4, 1, "JCY9999", "Corsa", 2020, m3, new Chassi(1, "CH-AAA-111", null), e3, e3, empresas);
        
        Moto moto = new Moto(4, 2, "JCY9999", "Corsa", 2020, m3, new Chassi(1, "CH-AAA-111", null), e3, e3, empresas);
        veiculos.addAll(Arrays.asList(carro, moto));

        System.out.println("--- Relatório: Motores ---");
        motores.forEach(System.out::println);
        System.out.println("\n--- Relatório: Cidades ---");
        cidades.forEach(System.out::println);
        System.out.println("\n--- Relatório: Empresas ---");
        empresas.forEach(System.out::println);
        System.out.println("\n--- Relatório: Veículos ---");
        veiculos.forEach(System.out::println);
    }
}
