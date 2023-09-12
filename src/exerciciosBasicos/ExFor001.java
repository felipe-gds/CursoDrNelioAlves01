package exerciciosBasicos;

import java.util.Scanner;
/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso
*/
public class ExFor001 {

    public static void main(String[] args) {
        System.out.println("Digite um valor inteiro, irei mostrar os ímpares antes dele: ");
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();

        for(int i = 0; i <= valor; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
