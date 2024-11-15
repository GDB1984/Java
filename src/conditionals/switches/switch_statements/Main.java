package conditionals.switches.switch_statements;

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
            case 1:
                System.out.println("Você escolheu a opção 1");
                System.out.println("Que é a opção de cadastrar produtos");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2");
                System.out.println("Que é a opção de listar produtos");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3");
                System.out.println("Que é a opção de sair do sistema");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
