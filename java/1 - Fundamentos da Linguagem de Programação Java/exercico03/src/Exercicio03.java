import java.util.Scanner;
/*
Exercícios

3. Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
   - fórmula: área=base X altura
 */

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do base" );
        int base = scanner.nextInt();
        System.out.println("Digite o tamanho do altura" );
        int height = scanner.nextInt();
        int area = base * height;


        System.out.println("O tamanho da area do retângulo e "+ area );
    }
}