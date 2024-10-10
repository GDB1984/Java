import java.util.Scanner;

public class Exemplovetor2 {
    public static void main(String[] args){
        int [] numeros = new int[10];

        Scanner entrada = new Scanner(System.in);

        // loop para leitura dos 10 numeros
        for (int i = 0; i < 10; i++){
            System.out.println("Digite o número: " + (i + 1));
            numeros[i] = entrada.nextInt();

        }
        // loop para imprimir os 10 números
        for (int i = 0; 1 < 10; i++){
            System.out.println("Número: " + (i + 1) + " = " + numeros[i]);
        }
        
        }

}
