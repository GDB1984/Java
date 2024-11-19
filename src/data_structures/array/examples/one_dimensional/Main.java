package data_structures.array.examples.one_dimensional;

// Array unidimensional (vetor)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] grades = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite uma nota: ");
            grades[i] = sc.nextDouble();
        }

        System.out.println("Imprimindo os valores do vetor");
        for (int i = 0; i < 5; i++) {
            System.out.println(grades[i]);
        }

        sc.close();
    }
}
