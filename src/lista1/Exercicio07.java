package lista1;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*7. Escreva um programa em Java que pergunte quanto o funcionário ganha por hora
        e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.*/

        Scanner read = new Scanner(System.in);
        double salario_h, salario;
        int num_h;

    System.out.print("\nDigite o quanto você ganha por hora: ");
        salario_h = read.nextDouble();
        System.out.print("\nDigite o número de horas trabalhadas no mês: ");
        num_h = read.nextInt();
        salario = salario_h * num_h;
        System.out.println("\nEste é o seu salário final ao mês: "+salario);







    }
}
