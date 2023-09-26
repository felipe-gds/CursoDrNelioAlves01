package exerciciosArraysListas001;

import java.util.Scanner;

public class AlturaMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantas pessoas serão avaliadas: ");

        int n = input.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            System.out.println("Digite a altura: ");
            vect[i] = input.nextDouble();
        }

        double sum  = 0.0;
        for (int i=0; i<n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("Altura média dos indivíduos: %.2f%n ", avg);
    }
}
