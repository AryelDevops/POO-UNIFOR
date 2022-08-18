package models;

public class Caminhao extends Veiculo{
    private double cargaSuportada;

    public Caminhao(String nome, int anoFabricacao, String cor, double precoCompra, int estoque) {
        super(nome, anoFabricacao, cor, precoCompra, estoque);
    }

    public double getCargaSuportada() {
        return cargaSuportada;
    }

    public void setCargaSuportada(double cargaSuportada) {
        this.cargaSuportada = cargaSuportada;
    }

    public double getPrecoCaminhao() {
        double precoVenda;
        if((getCargaSuportada() >= 3000)) {
            precoVenda = getPrecoCompra() * 1.07;
        } else {
            precoVenda = getPrecoCompra() * 1.05;
        }
        return precoVenda;
    }
}
