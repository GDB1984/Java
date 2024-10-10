public class Exemplovetor3 {
    public static void main(String[] args) {
        int maior = 0;
        int[] numeros = new int[] {90, 234, 567, 34, 688, 888, 988, 100000};

        //encontrar o maior número
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }

        }
        System.out.println("O maior número é: " + maior);
    }

}
