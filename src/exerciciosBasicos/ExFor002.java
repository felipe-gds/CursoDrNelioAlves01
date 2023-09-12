package exerciciosBasicos;

import java.util.Scanner;
/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

*/
public class ExFor002 {

    public static void main(String[] args) {
        System.out.println("Digite quantos números serão avaliados: ");
        Scanner input = new Scanner(System.in);

        int y = 0;
        int x = 0;
        int numero = input.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println("Digite o número " + (i + 1) );
            int numeros = input.nextInt();

            if (numeros >= 10 && numeros <= 20) {
                y = y + 1;
            } else {
                x = x + 1;
            }
        }

        System.out.println(y + "IN");
        System.out.println(x + "OUT");
    }
}
