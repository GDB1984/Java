package loops.examples.loop_do_while;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade;

        do {
            System.out.println("======== Digite uma nota válida (0 a 10) ========");
            grade = sc.nextDouble();
        } while (grade < 0 || grade > 10);

        System.out.println("Nota válida: " + grade);

        sc.close();
    }
}
