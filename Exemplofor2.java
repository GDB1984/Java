import java.util.Scanner;

public class Exemplofor2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int idade, acumuladorIdades = 0; // acumulador
        int cont; // declara o contador

        for(cont = 0; cont < 5; cont++){
            System.out.println("Digite a sua idade"); idade = entrada.nextInt();
            acumuladorIdades += idade; // acumula as idades 
        }
        System.out.println("A soma das idades é: " + acumuladorIdades);
        entrada.close();
    }
    
}
