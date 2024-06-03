package lista1;
import java.util.Scanner;
public class Exercicio08 {

    public static void main(String[] args) {
        /* 8. Faça um método que leia 4 valores inteiros e exiba o maior e o menor deles.*/

        Scanner read = new Scanner(System.in);
        int[] n = new int[4];
        int maior = 0, menor = 0;

        for (int i=0;i<4;i++){
            System.out.print("Digite um valor: ");
            n[i] = read.nextInt();

        }
        for (int i=0;i<4;i++) {
            if (i==0) {
            maior = n[i];
            menor = n[i];
            }else if (i==1){
                if(maior<n[1]){
                menor = maior;
                maior = n[i];
                }
                if (menor>=n[i]){
                    menor = n[i];
                }
            } else {
                if (n[i] >= maior) {
                    maior = n[i];
                }
                if (n[i] <= menor) {
                    menor = n[i];
                }
            }
        }
        System.out.print("\nEste é o maior número: "+maior);
        System.out.print("\nEste é o menor número: "+menor);
    }
}
