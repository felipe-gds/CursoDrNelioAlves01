package exerciciosBasicos;/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

import java.util.Scanner;
public class Ex002 {

    public static void main(String[] args) {
        System.out.println("Digite valores para A, B, C e D: ");
        Scanner numero = new Scanner(System.in);
        int A, B, C, D, diferenca;

        A = numero.nextInt();
        B = numero.nextInt();
        C = numero.nextInt();
        D = numero.nextInt();

        diferenca = (A * B) - (C * D);

        System.out.println("A diferença de produto de A e B pelo de C e D é: " + diferenca);
    }
}
