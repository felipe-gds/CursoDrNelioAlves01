package exerciciosPOO_01;

import java.util.Scanner;

public class Student {

    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double notaFinal() {
        return n1 + n2 + n3;
    }

    public String result() {
        if (notaFinal() >= 60) {
            return "APROVADO";
        } else {
            return "REPROVADO " + System.lineSeparator()
                    + "Faltam "
                    + (notaFinal() - 60.0)
                    + " Pontos";
        }
    }
}
