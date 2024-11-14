package conditionals.if_else.activities.ex_1;

/* Faça um algoritmo que leia um número inteiro:
    - Se o número for maior que 20, calcular e imprimir a metade dele. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = sc.nextInt();

        if (number > 20) {
            double half = (double) number / 2;
            System.out.printf("A metade de %d é %.1f", number, half);
        }

        sc.close();
    }
}
