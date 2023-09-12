package exerciciosPOO_01;

import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {
        System.out.println("Adicione a base e a altura do retangulo: ");
        Scanner input = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        rectangle.width = input.nextDouble();
        rectangle.height = input.nextDouble();

        System.out.println("Area = " + rectangle.area());
        System.out.println("Perimetro = " + rectangle.perimeter());
        System.out.println("Diagonal = " + rectangle.diagonal());
    }
}
