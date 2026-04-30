/*
Exercícios

5. Escreva um código onde o usuário entra com um número e seja gerado a tabuada de 1 até 10 desse número;
 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada:");
        int number = scanner.nextInt();

        for (int i = 1; i <=10 ; i++) {

            System.out.println(number +" * " +i +" = "+ (number * i));

        }

    }
}
