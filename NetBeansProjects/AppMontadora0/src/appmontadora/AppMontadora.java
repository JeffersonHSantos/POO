package appmontadora;

import br.upf.ads.montadora.domain.*;
import java.util.ArrayList;
import java.util.List;

public class AppMontadora {

    public static void main(String[] args) {

        // ====== Listas principais ======
        List<Motor> motores = new ArrayList<>();
        List<Cidade> cidades = new ArrayList<>();
        List<Empresa> empresas = new ArrayList<>();
        List<Veiculo> veiculos = new ArrayList<>();

        // ====== Motores ======
        motores.add(new Motor(1, "MOT100", 4));
        motores.add(new Motor(2, "MOT200", 6));
        motores.add(new Motor(3, "MOT300", 2));

        // ====== Cidades ======
        cidades.add(new Cidade(1, "Passo Fundo", "RS"));
        cidades.add(new Cidade(2, "Marau", "RS"));
        cidades.add(new Cidade(3, "Carazinho", "RS"));

        // ====== Empresas ======
        empresas.add(new Empresa(1, "Empresa ABC", "12.345.678/0001-12")); // fabricante
        empresas.add(new Empresa(2, "Fornecedor XYZ", "98.765.432/0001-98")); // fornecedor
        empresas.add(new Empresa(3, "Transportadora ABC", "45.658.432/0001-98"));

        // ====== Veículos ======

        Carro carro = new Carro(
                1,
                "ASD1234",
                "Fusca Itamar",
                1995,
                5,
                2,
                motores.get(0),
                new Chassi(1, "CHS1111"),
                empresas.get(0) // fabricante
        );

        Moto moto = new Moto(
                2,
                "MOT654",
                "CG Titan",
                2020,
                motores.get(2),
                new Chassi(2, "CHS2222"),
                empresas.get(1), // fornecedor
                150 // cilindradas
        );

        veiculos.add(carro);
        veiculos.add(moto);

        // ====== Relatório ======
        System.out.println("=== RELATÓRIO DE VEÍCULOS ===");

        for (Veiculo v : veiculos) {
            switch (v) {

                case Carro c -> {
                    System.out.println("Carro:");
                    System.out.println("Placa: " + c.getPlaca());
                    System.out.println("Modelo: " + c.getModelo());
                    System.out.println("Número de Passageiros: " + c.getNumPassageiros());
                    System.out.println("Cilindros: " + c.getMotor().getCilindros());
                    System.out.println("Chassi: " + c.getChassi().getNumero());
                    System.out.println("Fabricante: " + c.getFabricante().getNome());
                    System.out.println();
                }

                case Moto m -> {
                    System.out.println("Moto:");
                    System.out.println("Placa: " + m.getPlaca());
                    System.out.println("Modelo: " + m.getModelo());
                    System.out.println("Modelo do Motor: " + m.getMotor().getModelo());
                    System.out.println("Chassi: " + m.getChassi().getNumero());
                    System.out.println("Fornecedor: " + m.getFornecedor().getNome());
                    System.out.println();
                }

                default -> {}
            }
        }
    }
}
