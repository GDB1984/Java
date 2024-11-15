package loops.activities.ex_2;

/* Faça um algoritmo que leia 10 números inteiros usando while e diga:
    - Quantos são pares;
    - E quantos são ímpares. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 1;
        int even = 0;
        int odd = 0;

        while (count <= 10) {
            System.out.printf("Digite o %dº número: ", count);
            int number = sc.nextInt();

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            count++;
        }

        sc.close();

        System.out.println("O total de número pares é: " + even);
        System.out.println("O total de número ímpares é: " + odd);
    }
}
