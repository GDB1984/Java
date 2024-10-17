// Exercício 3
Criar um método chamado encontrarMax
seu método deve receber dois números (int) como parâmetro de entrada;
e deve retornar o maior valor entre esses números.
Para testar seu programa:
Leia dois números do usuário.
chame o método passando esses números.
imprima o valor retornado pelo seu método. //


import java.util.Scanner;

public class EncontrarMax {

    // Método para encontrar o maior valor entre dois números
    public static int encontrarMax(int a, int b) {
        return (a > b) ? a : b; // Retorna o maior número
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê dois números do usuário
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Chama o método e armazena o resultado
        int maior = encontrarMax(num1, num2);

        // Imprime o valor retornado
        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
