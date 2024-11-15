package conditionals.if_else.activities.ex_2;

/* Faça um algoritmo que:
    - Receba a idade de uma pessoa;
    - Se for maior de idade imprima: "maior de idade";
    - Senão imprima: "menor de idade". */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        sc.close();
    }
}
