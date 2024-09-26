import java.util.Scanner;

public class Validacao {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double nota;

        do{
            System.out.println("****Digite uma nota****");
            nota = entrada.nextDouble();
        }while (nota <0 || nota > 10);

        System.out.println("Nota correta");

        entrada.close();
    }
    
}
