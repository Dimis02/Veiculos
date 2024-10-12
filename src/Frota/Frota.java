package Frota;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos;

    public Frota() {
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void exibirFrota() {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.exibirDetalhes());
        }
    }
}
