package exerciciosPOO_01.applications;

import exerciciosPOO_01.utils.Student;

import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Qual o nome do aluno? ");
        student.name = input.nextLine();
        System.out.println("Adicione a nota do primeiro trimestre (até 30)");
        student.n1 = input.nextDouble();
        System.out.println("Adicione a nota do segundo trimestre (até 35)");
        student.n2 = input.nextDouble();
        System.out.println("Adicione a nota do terceiro trimestre (até 35)");
        student.n3 = input.nextDouble();

        System.out.println("Nota final: " + student.notaFinal());
        System.out.println(student.result());

    }
}
