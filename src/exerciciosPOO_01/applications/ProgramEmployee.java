package exerciciosPOO_01.applications;

import exerciciosPOO_01.utils.Employee;

import java.util.Scanner;

public class ProgramEmployee {

    public static void main(String[] args) {
        System.out.println("Adicione o Nome, Salário bruto e Imposto do funcionário: ");
        Scanner input = new Scanner(System.in);

        Employee employee = new Employee();
        employee.name = input.nextLine();
        employee.grossSalary = input.nextDouble();
        employee.tax = input.nextDouble();

        System.out.println(employee);

        System.out.println("Qual porcentagem será de aumento? ");
        employee.increaseSalary(input.nextDouble());

        System.out.println("Dados atualizados: " + employee.name + ", $" + employee.grossSalary);
    }
}
