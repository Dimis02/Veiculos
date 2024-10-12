package Frota;

public class Moto extends Veiculo {
    private String tipo;

    public Moto(String marca, String modelo, int ano, String tipo) {
        super(marca, modelo, ano);
        this.tipo = tipo;
    }

    @Override
    public String exibirDetalhes() {
        return "Moto: " + super.exibirDetalhes() + ", Tipo: " + tipo;
    }
}
