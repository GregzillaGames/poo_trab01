package lista1;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String args[]) {
        //4.	Crie um programa em Java que imprima o sexo de uma pessoa utilizando como valores de entrada M ou F.
        char sexo;
        Scanner read = new Scanner(System.in);

        System.out.println("Qual é o seu sexo? [F | M] ");
        sexo = read.next().toUpperCase().charAt(0);
        if (sexo == 'M') {
            System.out.println("\nParabéns! Você é do sexo masculino");
        } else if (sexo == 'F'){
            System.out.println("\nParabéns! Você é do sexo feminino");
        } else {
            System.out.println("\nErro no programa, esse sexo não existe X-X 404");
        }
    }
}
