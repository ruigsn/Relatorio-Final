package Calculadora;

public class Principal {

    public static void main(String[] args) {

        MediaProva mediaProva = new MediaProva();
        mediaProva.mediaProva();

        CelsiusParaFahrenheit convert = new CelsiusParaFahrenheit();
        convert.celsiusParaFahrenheit();

        AreaCircunferencia areaCirc = new AreaCircunferencia();
        areaCirc.areaCirc();

        LadoQuadrado ladoqua = new LadoQuadrado();
        ladoqua.lado();

        AumentoSalarial sal = new AumentoSalarial();
        sal.aumentar();

    }
}
