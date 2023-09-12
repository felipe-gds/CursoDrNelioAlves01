package exerciciosBasicos;/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais
 */

import java.util.Scanner;
public class Ex001 {
    public static void main(String[] args) {
        Scanner circulo = new Scanner(System.in);
        System.out.println("Qual o raio do círculo? ");
        double raioDoCirculo = circulo.nextDouble();
        double valorAreaCirculo = 3.14159 * (raioDoCirculo * raioDoCirculo);
        System.out.printf("%.4f", valorAreaCirculo);
    }
}