/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Jeff
 */
public class Veiculo {
    // Espécie
    private String especie; // carga ou passageiro

    // Informações do veículo
    private String placa;
    private String marca;
    private String modelo;
    private int anoModelo;
    private int anoFabricacao;
    private String chassi;
    private String renavam;
    private String procedencia; // nacional ou importado
    private double capacidadeMaximaCargaKg;
    private double altura;
    private double largura;
    private double profundidade;
    private String corExterna;
    private String corInterna;
    private String tipoCombustivel;
    private String motor;
    private double quilometragem;
    private double consumoMedio;
    private int numeroPortas;
    private int numeroPassageiros;
    private String opcionais;

    public Veiculo() {
    }
    
    public Veiculo(String especie, String placa, String marca, String modelo) {
        this.especie = especie;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters e Setters
    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAnoModelo() { return anoModelo; }
    public void setAnoModelo(int anoModelo) { this.anoModelo = anoModelo; }

    public int getAnoFabricacao() { return anoFabricacao; }
    public void setAnoFabricacao(int anoFabricacao) { this.anoFabricacao = anoFabricacao; }

    public String getChassi() { return chassi; }
    public void setChassi(String chassi) { this.chassi = chassi; }

    public String getRenavam() { return renavam; }
    public void setRenavam(String renavam) { this.renavam = renavam; }

    public String getProcedencia() { return procedencia; }
    public void setProcedencia(String procedencia) { this.procedencia = procedencia; }

    public double getCapacidadeMaximaCargaKg() { return capacidadeMaximaCargaKg; }
    public void setCapacidadeMaximaCargaKg(double capacidadeMaximaCargaKg) { this.capacidadeMaximaCargaKg = capacidadeMaximaCargaKg; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getLargura() { return largura; }
    public void setLargura(double largura) { this.largura = largura; }

    public double getProfundidade() { return profundidade; }
    public void setProfundidade(double profundidade) { this.profundidade = profundidade; }

    public String getCorExterna() { return corExterna; }
    public void setCorExterna(String corExterna) { this.corExterna = corExterna; }

    public String getCorInterna() { return corInterna; }
    public void setCorInterna(String corInterna) { this.corInterna = corInterna; }

    public String getTipoCombustivel() { return tipoCombustivel; }
    public void setTipoCombustivel(String tipoCombustivel) { this.tipoCombustivel = tipoCombustivel; }

    public String getMotor() { return motor; }
    public void setMotor(String motor) { this.motor = motor; }

    public double getQuilometragem() { return quilometragem; }
    public void setQuilometragem(double quilometragem) { this.quilometragem = quilometragem; }

    public double getConsumoMedio() { return consumoMedio; }
    public void setConsumoMedio(double consumoMedio) { this.consumoMedio = consumoMedio; }

    public int getNumeroPortas() { return numeroPortas; }
    public void setNumeroPortas(int numeroPortas) { this.numeroPortas = numeroPortas; }

    public int getNumeroPassageiros() { return numeroPassageiros; }
    public void setNumeroPassageiros(int numeroPassageiros) { this.numeroPassageiros = numeroPassageiros; }

    public String getOpcionais() { return opcionais; }
    public void setOpcionais(String opcionais) { this.opcionais = opcionais; }

    @Override
    public String toString() {
        return String.format("""
        Veículo [%s]
        Placa: %s
        Marca: %s
        Modelo: %s
        Ano Modelo: %d
        Ano Fabricação: %d
        Chassi: %s
        Renavam: %s
        Procedência: %s
        Capacidade Máx. Carga: %.2f kg
        Dimensões (A x L x P): %.2fm x %.2fm x %.2fm
        Cor Externa: %s
        Cor Interna: %s
        Combustível: %s
        Motor: %s
        Quilometragem: %.1f km
        Consumo Médio: %.1f km/l
        Portas: %d
        Passageiros: %d
        Opcionais: %s
        """,
        especie, placa, marca, modelo, anoModelo, anoFabricacao,
        chassi, renavam, procedencia, capacidadeMaximaCargaKg,
        altura, largura, profundidade, corExterna, corInterna,
        tipoCombustivel, motor, quilometragem, consumoMedio,
        numeroPortas, numeroPassageiros, opcionais);
    }
}

