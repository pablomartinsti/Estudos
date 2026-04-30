/*
Exercícios

7. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolha
entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção
inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;
 */

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int number1 = scanner.nextInt();

        System.out.println("Digite um numero maior que o primeiro");
        int number2 = scanner.nextInt();

        while (number2 <= number1) {
            System.out.println("Número inválido. Digite um número maior que o primeiro:");
            number2 = scanner.nextInt();
        }

        System.out.println("Escolha a opção: 1 - ímpar | 2 - par");

        int opcao = scanner.nextInt();
        while (opcao != 1 && opcao != 2) {
            System.out.println("Opção inválida. Escolha 1 para ímpar ou 2 para par:");
            opcao = scanner.nextInt();
        }


        for (int i = number2; i >= number1 ; i--) {

            if(i % 2 == 0 && opcao == 2 ){
                System.out.println(i +" e par");
            }else if(i % 2 != 0 && opcao == 1) {
                System.out.println(i +" e impar");
            }
        }



    }
}
