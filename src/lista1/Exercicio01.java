package lista1;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String args[]) {
        //1.	Faça um programa em Java que leia um número inteiro e exiba tanto seu sucessor quanto seu antecessor.
        int n, ant, suc;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = read.nextInt();
        System.out.println("\nO sucessor de " + n + " é " + n++ + ".");
        System.out.println("O antecessor de " + n + " é " + n-- + ".");
    }
}
