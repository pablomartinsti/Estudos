/*
Exercícios

8. Escreva um código onde o usuário informa um número inicial, posteriormente informará outros N números,
a execução do código continuará até que o número informado dividido pelo primeiro número tenha resto diferente
de 0 na divisão, números menores que o primeiro número devem ser ignorados
 */

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inicial:");
        int initialNumber = scanner.nextInt();

        int numberInformed;

      while (true){

          System.out.println("Digite outro numero:");
          numberInformed = scanner.nextInt();

          if(numberInformed < initialNumber){
              System.out.println("Numero ignorado (menor que o inicial)");
              continue;

          } else if (numberInformed % initialNumber != 0) {
              System.out.println("Resto diferente de 0. Encerrando...");
              break;
          }else{
              System.out.println("Divisivel. Continue...");
          }


      }

    }
}
