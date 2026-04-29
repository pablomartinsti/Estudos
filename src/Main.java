import java.util.Scanner;
import java.time.Year;

/** Exercícios
 1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem:
   "Olá 'Fulano' você tem 'X' anos"
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String name = scanner.next();
        System.out.println("Digite seu ano de nascimento");
        int yearBirth = scanner.nextInt();
        int currentYear = Year.now().getValue();
        int age = currentYear - yearBirth;
        System.out.println("Olá " + name + " você tem " + age + " anos");
    }
}