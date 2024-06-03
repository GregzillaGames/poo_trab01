package lista1;
import java.util.Scanner;
public class Exercicio05 {
    public static void main (String args[]){
       /* 5. Programe um aplicativo em Java que leia um nome e uma idade. Se a idade for menor que 16,
       deve exibir o nome juntamente com a mensagem “Não pode votar!”, caso contrário,
       deve exibir o nome com a mensagem “Apto a votar!”.*/
        String nome;
        int idade;
        Scanner read = new Scanner (System.in);
        System.out.print("Digite o seu nome: ");
        nome = read.next().toUpperCase();
        System.out.print("Agora, digite a sua idade: ");
        idade = read.nextInt();

        if (idade<16){
            System.out.println(nome+", você não está apto a votar!");
        } else {
            System.out.println(nome+", você está apto a votar!");
        }
        

    }
}
