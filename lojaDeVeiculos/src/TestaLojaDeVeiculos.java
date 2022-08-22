import models.*;

public class TestaLojaDeVeiculos {
    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao("mercedes-benz", 2015, "preto",
                2500, 700000, 54);
        double precoCompraCaminhao = caminhao.getPrecoCompra();
        double precoVendaCaminhao = caminhao.calculaPrecoVenda();

        Carro carro = new Carro("Onix", "sedan", 2017, "preto",
                60000, 50 );
        double precoCompraCarro = carro.getPrecoCompra();
        double precoVendaCarro = carro.calculaPrecoVenda();

        Moto moto = new Moto("Bros", 2020, "vermelho",
                18000, 50, true);
        double precoCompraMoto = moto.getPrecoCompra();
        double precoVendaMoto = moto.calculaPrecoVenda();

        Quadriciclo quadriciclo = new Quadriciclo("Honda", 2020, "branco",
                18000, 50, "4x4");
        double precoCompraQuadriciclo = quadriciclo.getPrecoCompra();
        double precoVendaQuadriciclo = quadriciclo.calculaPrecoVenda();

        Seguro seguro = new Seguro("1", caminhao);
        double precoVendaSeguro = seguro.calculaPrecoVenda();

        System.out.println("#### CAMINHAO ####");
        System.out.println("O preco de compra é: " + precoCompraCaminhao);
        System.out.println("O preco de venda é: " + precoVendaCaminhao);

        System.out.println("#### CARRO ####");
        System.out.println("O preco de compra é: " + precoCompraCarro);
        System.out.println("O preco de venda é: " + precoVendaCarro);

        System.out.println("#### MOTO ####");
        System.out.println("O preco de compra é: " + precoCompraMoto);
        System.out.println("O preco de venda é: " + precoVendaMoto);

        System.out.println("#### QUADRICICLO ####");
        System.out.println("O preco de compra é: " + precoCompraQuadriciclo);
        System.out.println("O preco de venda é: " + precoVendaQuadriciclo);

        System.out.println("#### SEGURO ####");
        System.out.println("O preco de venda é: " + precoVendaSeguro);

    }
}
