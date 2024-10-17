public class valorRetornado{

    public static void main(String[] args) {  
        int valorRetornado;
        System.out.println("Realizando a soma de dois numeros");
        valorRetornado = somar(10, 50);  
        System.out.println("Fim da soma");
        System.out.println("Soma dos parametros: " + valorRetornado);
        }
    
        public static int somar(int n1, int n2) {  
            return n1 + n2;
        }
    }   