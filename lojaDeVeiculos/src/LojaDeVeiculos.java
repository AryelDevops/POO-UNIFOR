import models.Carro;
import models.Moto;
import models.Quadriciclo;
import models.Seguro;

public class LojaDeVeiculos {
    public static void main(String[] args) {

        Carro carro = new Carro("Onix", "sedan", 2017, "preto", 60000, 50 );
        Carro carro2 = new Carro("Onix", "hatch", 2019, "preto", 60000, 50 );

        Moto moto = new Moto("Bros", 2020, "vermelho", 18000, 50, true);
        Moto moto2 = new Moto("Bros", 2020, "branco", 18000, 50, true);

        Quadriciclo quadriciclo = new Quadriciclo("Honda", 2020, "branco", 18000, 50, "4x4");
        Quadriciclo quadriciclo2 = new Quadriciclo("Honda", 2020, "branco", 18000, 50, "4x2");

        Seguro seguro = new Seguro("1", moto);


//        System.out.println(repostaInferior);
//        System.out.println(repostaSuperior);
        System.out.println(moto.calculaPrecoVenda());
//        System.out.println(moto2.calculaPrecoVenda());
//        System.out.println("O preço de venda do Quadriciclo é: "+ quadriciclo.calculaPrecoVenda());
//        System.out.println("O preço de venda do Quadriciclo2 é: "+ quadriciclo.calculaPrecoVenda());
        System.out.println("O preço de venda do seguroCarro2 é: "+ seguro.calculaPrecoVenda());

    }
}
