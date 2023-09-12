package exerciciosBasicos;/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*/

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        System.out.println("Digite o número, horas trabalhadas e valor/hora do funcionário: ");
        Scanner sc = new Scanner(System.in);
        int funcionario, horas;
        double valorHora, salario;

        funcionario = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = horas * valorHora;

        System.out.println("Funcionário: " + funcionario);
        System.out.printf("Recebe: %.2f", salario);
    }
}
