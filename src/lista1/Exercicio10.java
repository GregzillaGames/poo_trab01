package lista1;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String args[]){
/*
10.	Desenvolva um programa em Java que calcule a quantidade de dinheiro gasta por um fumante.
O usuário deverá fornecer o número de anos que ele fuma,
o número de cigarros fumados por dia e o preço de uma carteira.
Considere que existem 20 cigarros em uma carteira.
*/
        int ano_c, dia_c, cig_d;
        double preco, preco_c=0, total;
        Scanner read = new Scanner (System.in);

        System.out.println("\nA quantos anos você fuma?");
        ano_c = read.nextInt();
        System.out.println("\nQuantos cigarros você fuma por dia?");
        cig_d = read.nextInt();
        System.out.println("\nQual é o preço da carteira?");
        preco = read.nextDouble();

        dia_c = ano_c * 365;
        preco_c = preco/20;
        total = dia_c*cig_d*preco_c;

        System.out.println("\nEsta é a quantidade de dinheiro que o fumante gasta: "+total);







    }
}
