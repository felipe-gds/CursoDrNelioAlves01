package exerciciosPOO_01.utils;

public class CurrencyConverter {
    public static double reais(double dolar, double qnt) {
        return (dolar + (dolar * 0.06)) * qnt;
    }

}
