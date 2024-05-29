package lista1;

import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        //1.	Faça um programa em Java que leia um número inteiro e exiba tanto seu sucessor quanto seu antecessor.
        int n, ant, suc;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = read.nextInt();
        suc = n + 1;
        ant = n - 1;
        System.out.println("\nO sucessor de " + n + " é " + suc +".");
        System.out.println("O antecessor de " + n + " é " + ant +".");

        /*
2.	Escreva um programa em Java que leia uma distância inteira percorrida (em quilômetros), bem como o total de combustível gasto (em litros) e informe a média de consumo do veículo por km.
3.	Faça um programa em Java que leia 2 números e exiba qual deles é o maior ou então informe que são iguais.
4.	Crie um programa em Java que imprima o sexo de uma pessoa utilizando como valores de entrada M ou F.
5.	Programe um aplicativo em Java que leia um nome e uma idade. Se a idade for menor que 16, deve exibir o nome juntamente com a mensagem “Não pode votar!”, caso contrário, deve exibir o nome com a mensagem “Apto a votar!”.
6.	Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo em Java que pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não.
7.	Escreva um programa em Java que pergunte quanto o funcionário ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
8.	Faça um método que leia 4 valores inteiros e exiba o maior e o menor deles.
9.	Faça um programa em Java que leia o nome e 3 notas de um aluno. Se obtiver média maior que 7 exibir a mensagem de aprovado, se ficar entre 5 e 7, exibir a mensagem em exame, e se for abaixo disso, exibir reprovado. Lembrando que terá que exibir o nome do aluno também.
10.	Desenvolva um programa em Java que calcule a quantidade de dinheiro gasta por um fumante. O usuário deverá fornecer o número de anos que ele fuma, o número de cigarros fumados por dia e o preço de uma carteira. Considere que existem 20 cigarros em uma carteira.
*/
    }
}
