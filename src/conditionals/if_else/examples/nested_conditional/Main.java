package conditionals.if_else.examples.nested_conditional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Digite um número inteiro: ");
        number = sc.nextInt();

        if (number == 15) {
            System.out.println("Você acertou!");
        } else if (number < 15) {
            System.out.println("Seu palpite foi menor que o número correto.");
        } else {
            System.out.println("Seu palpite foi maior que o número correto.");
        }

        sc.close();
    }
}
