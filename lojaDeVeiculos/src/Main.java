import models.Carro;
import models.Moto;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Onix", "sedan", 2019, "preto", 60000, 50 );
        Carro carro2 = new Carro("Onix", "sedan", 2017, "preto", 60000, 50 );
        Moto moto = new Moto("Bros", 2020, "vermelho", 18000, 50, true);
        Moto moto2 = new Moto("Bros", 2020, "branco", 18000, 50, true);

        System.out.println(carro.getPrecoCarro());
        System.out.println(carro2.getPrecoCarro());
        System.out.println(moto.getPrecoMoto());
        System.out.println(moto2.getPrecoMoto());

    }
}
