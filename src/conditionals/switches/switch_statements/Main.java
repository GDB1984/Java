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
                System.out.println("Cadastrando produtos...");
                break;
            case 2:
                System.out.println("Listando produtos...");
                break;
            case 3:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
