package lista1;
import java.util.Scanner;
public class Exercicio03 {
    public static void main (String args[]){
        // 3. Faça um programa em Java que leia 2 números e exiba qual deles é o maior ou então informe que são iguais.
        double n1, n2;
        Scanner read = new Scanner (System.in);
        System.out.print("Digite um número: ");
        n1 = read.nextDouble();
        System.out.print("Digite um outro número: ");
        n2 = read.nextDouble();

        if(n1>n2){
            System.out.println("\n"+n1+" é maior que "+n2);
            System.out.println("Por consequência, "+n2+" é menor que "+n1);
        } else if(n1==n2){
            System.out.println("\nOs valores digitados são idênticos ("+n1+" e "+n2+")");
        } else {
            System.out.println("\n"+n2+ " é maior que "+n1);
            System.out.println("Por consequência, "+n1+" é menor que "+n2);
        }
    }
}
