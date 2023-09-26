package exerciciosPOO_01.applications;

import exerciciosPOO_01.utils.CurrencyConverter;

import java.util.Scanner;

/*
Calculadora de compra de dólar, acrescentando 6% de IOF
*/
public class ProgramCurrencyConverter {
    public static void main(String[] args) {
        System.out.println("Qual o preço do dólar?");
        Scanner input = new Scanner(System.in);
        double dolar = input.nextDouble();
        System.out.println("Quantos dólares irá precisar?");
        double qnt = input.nextDouble();
        System.out.println("Valor pago em reais: R$ " + CurrencyConverter.reais(dolar, qnt));
    }
}
