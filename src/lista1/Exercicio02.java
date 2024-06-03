package lista1;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String args[]) {

        /*2. Escreva um programa em Java que leia uma distância inteira percorrida (em quilômetros),
        bem como o total de combustível gasto (em litros) e informe a média de consumo do veículo por km.*/
        Scanner read = new Scanner(System.in);
        double comb_gasto, media_cons;
        int dist;

        System.out.print("Qual foi a distância percorrida (em quilômetros): ");
        dist = read.nextInt();
        System.out.print("Qual foi o total de combustível gasto (em litros): ");
        comb_gasto = read.nextDouble();
        media_cons = dist / comb_gasto;
        System.out.println("A média do carro é " + media_cons + " km/l");
    }
}
