import java.util.Scanner;
/*
Exercícios

4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
 */

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa" );
        String name1 = scanner.next();
        System.out.println("Digite o idade da primeira pessoa" );
        int age1 = scanner.nextInt();

        System.out.println("Digite o nome da segunda pessoa" );
        String name2 = scanner.next();
        System.out.println("Digite o idade da segunda pessoa" );
        int age2 = scanner.nextInt();

        int resultAge = Math.abs(age1 - age2);



        System.out.println(name1 +" tem " + age1 + " e " + name2 + " tem " +age2 + " com isso a difrença de idade deles é " +resultAge );
    }
}