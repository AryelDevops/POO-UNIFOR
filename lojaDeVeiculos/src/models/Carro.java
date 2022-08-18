package models;

public class Carro extends Veiculo {
    private String modeloCarro;

    public Carro(String nome, String modeloCarro, int anoFabricacao, String cor, double precoCompra, int estoque) {
        super(nome, anoFabricacao, cor, precoCompra, estoque);
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public double getPrecoCarro() {
        double precoVenda;
        if((getAnoFabricacao() < 2018) && (getModeloCarro() == "sedan")) {
            precoVenda = getPrecoCompra() * 1.3;
        } else {
            precoVenda = getPrecoCompra() * 1.15;
        }
        return precoVenda;
    }
}
