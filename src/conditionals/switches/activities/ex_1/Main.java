package conditionals.switches.activities.ex_1;

/* Crie um algoritmo que leia um número de 1 a 7.
    - Imprima o dia da semana correspondente;
    - Assuma que 1 corresponde ao Domingo. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7: ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Teça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Por favor, digite um valor válido");
                sc.close();
        }

        sc.close();
    }
}
