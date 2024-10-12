package Frota;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    @Override
    public String exibirDetalhes() {
        return "Carro: " + super.exibirDetalhes() + ", Portas: " + numPortas;
    }
}
