import java.util.Scanner;
/*
Exercícios

2. Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
   - fórmula: área=lado X lado
 */

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado" );
        int side = scanner.nextInt();
        int area = side * side;


        System.out.println("O tamanho da area do quadrado e "+ area );
    }
}
