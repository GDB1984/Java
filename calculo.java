public class calculo {

public static void main(String[] args) {  
    System.out.println("Realizando o cálculo com dois números");  
    calcular(50, 10);
    System.out.println("Fim do cálculo");
    }
    
    public static void calcular(int n1, int n2) {
    float resultado = ((n1 * n2) - (n1 + n2))/ (n1 - n2);  
    System.out.println("Resultado da equação: " + resultado);
    }
}