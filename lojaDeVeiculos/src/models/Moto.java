package models;

public class Moto extends Veiculo {
    private boolean modeloEsportivo;

    public Moto(String nome, int anoFabricacao, String cor, double precoCompra, int estoque, boolean modeloEsportivo) {
        super(nome, anoFabricacao, cor, precoCompra, estoque);
    }

    public boolean isModeloEsportivo() {
        return modeloEsportivo;
    }

    public void setModeloEsportivo(boolean modeloEsportivo) {
        this.modeloEsportivo = modeloEsportivo;
    }

    public double getPrecoMoto() {
        double precoVenda;
        if((getCor() == "verde" || getCor() == "vermelho") && modeloEsportivo) {
            precoVenda = getPrecoCompra() * 1.4;
        } else {
            precoVenda = getPrecoCompra() * 1.1;
        }
        return precoVenda;
    }
}
