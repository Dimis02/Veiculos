package Frota;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String exibirDetalhes() {
        return "Veículo: " + marca + " " + modelo + ", Ano: " + ano;
    }
}

