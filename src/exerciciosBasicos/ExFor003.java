package exerciciosBasicos;

import java.util.Scanner;

/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
*/

public class ExFor003 {
    public static void main(String[] args) {
        System.out.println("Quantos Casos de Testes serão avaliados? ");
        Scanner input = new Scanner(System.in);

        int casosDeTeste = input.nextInt();

        for (int i = 1; i <= casosDeTeste; i++) {
            System.out.println("Digite os três resultados do Caso de Teste " + i);
            double casodeTeste1 = input.nextDouble();
            double casodeTeste2 = input.nextDouble();
            double casodeTeste3 = input.nextDouble();

            double resultado = ((casodeTeste1 * 2) + (casodeTeste2 * 3) + (casodeTeste3 * 5)) / 10;

            System.out.printf("Média Ponderada do CT" + i  + ": %.1f%n ", resultado);
        }
    }

}
