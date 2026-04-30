/*
Exercícios

6. Escreva um código onde o usuário entra com sua altura e peso, seja feito o cálculo do seu IMC(IMC = peso/(altura * altura)) e seja exibido a mensagem de acordo com o resultado:

Se for menor ou igual a 18,5 "Abaixo do peso";
se por entre 18,6 e 24,9 “Peso ideal”;
Se for entre 25,0 e 29,9 "Levemente acima do peso";
Se entre 30,0 e 34,9 “Obesidade Grau I”;
Se for entre 35,0 e 39,9 “Obesidade Grau II (Severa)”;
Se for maior ou igual a 40,0 “Obesidade III (Mórbida)”;
 */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua altura em cm ex 1,99:");
        double height = scanner.nextDouble();

        System.out.println("Digite o seu peso ex 79,99:");
        double weight = scanner.nextDouble();

        double imc = weight / (height * height);

      if(imc>=18.6 && imc <= 24.9){
          System.out.println("Peso ideal");
      } else if (imc>=25.0 && imc <= 29.9) {
          System.out.println("Levemente acima do peso");
      } else if (imc>=30.0 && imc <= 34.9) {
          System.out.println("Obesidade Grau I");
      } else if (imc>=35.0 && imc <= 39.9) {
          System.out.println("Obesidade Grau II (Severa)");
      } else {
          System.out.println("Obesidade III (Mórbida)");
      }

    }
}
