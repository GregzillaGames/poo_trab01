package lista1;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args){
        /*6. Para doar sangue é necessário ter entre 18 e 67 anos.
        Faça um aplicativo em Java que pergunte a idade de uma pessoa
        e diga se ela pode doar sangue ou não.*/

        int idade;
        Scanner read = new Scanner(System.in);

        System.out.println("\nQual é a sua idade?");
        idade = read.nextInt();

        if(idade >= 18 && idade <= 67){
            System.out.println("\nVocê pode doar sangue.");
        } else {
            System.out.println("\nVocê não pode doar sangue.");
        }


    }
}
