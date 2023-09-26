package exerciciosArraysListas001;

import java.util.Scanner;

public class ProgramProduto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos: ");

        int n = input.nextInt();
        Produto[] vect = new Produto[n];

        for (int i=0; i< vect.length; i++ ) {
            System.out.println("Digite o nome do produto: ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.println("Digite o valor: ");
            double preco = input.nextDouble();
            vect[i] = new Produto(nome, preco);
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++) {
            sum += vect[i].getPreco();
        }

        double avg = sum / n;

        System.out.printf("Média de valores dos produtos: %.2f%n", avg);

    }
}
