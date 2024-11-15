package conditionals.switches.switch_expressions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======== Menu de opções ========");
        System.out.println("1. Cadastrar produtos");
        System.out.println("2. Listar produtos");
        System.out.println("3. Sair do sistema");
        System.out.println("======== Esoclha uma opção ========");

        int option = sc.nextInt();
        switch (option) {
            case 1 -> System.out.println("Você escolheu a opção 1\nQue é a opção de cadastrar produtos");
            case 2 -> System.out.println("Você escolheu a opção 2\nQue é a opção de listar produtos");
            case 3 -> System.out.println("Você escolheu a opção 3\nQue é a opção de sair do sistema");
            default -> System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
