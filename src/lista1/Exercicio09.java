package lista1;

import java.util.Scanner;

public class Exercicio09 {
    /* 9. Faça um programa em Java que leia o nome e 3 notas de um aluno.
    - Se obtiver média maior que 7 exibir a mensagem de aprovado;
    - Se ficar entre 5 e 7, exibir a mensagem em exame;
    - Se for abaixo disso, exibir reprovado.

    Lembrando que terá que exibir o nome do aluno também.*/

    public static void main(String[] args) {
        String nome;
        double media=0;
        double notas[] = new double[3];
        Scanner read = new Scanner(System.in);

        System.out.print("\nDigite o nome do aluno: ");
        nome = read.nextLine();

        System.out.println("");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno: ");
            notas[i] = read.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media = media/3;

        if (media>7){
            System.out.println("\n"+nome+", você está aprovado com sucesso!");
        } else if (media<=7 && media>=5){
            System.out.println("\n"+nome+", você está em exame.");
        } else {
            System.out.println("\n"+nome+", você está reprovado.");
        }
    }
}
