package Frota;

public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota();

        // Criando instâncias de diferentes tipos de veículos
        Carro carro1 = new Carro("Toyota", "Corolla", 2021, 4);
        Moto moto1 = new Moto("Honda", "CB500", 2020, "Esportiva");
        Caminhao caminhao1 = new Caminhao("Scania", "R450", 2018, "Carga pesada");

        // Adicionando os veículos à frota
        frota.adicionarVeiculo(carro1);
        frota.adicionarVeiculo(moto1);
        frota.adicionarVeiculo(caminhao1);

        // Exibindo os detalhes de todos os veículos na frota
        frota.exibirFrota();
    }
}
