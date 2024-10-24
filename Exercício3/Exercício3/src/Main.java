public class Main {
    public static void main(String[] args) {
        // Criando um array de objetos Carro
        Carro[] carros = new Carro[2];

        // Instanciando os objetos Carro
        carros[0] = new Carro();
        carros[0].marca = "Honda";
        carros[0].modelo = "Civic";
        carros[0].velocidademaxima = 210; // em km/h
        carros[0].cor = "Preto";

        carros[1] = new Carro();
        carros[1].marca = "Ferrari";
        carros[1].modelo = "Ferrari F8";
        carros[1].velocidademaxima = 340; // em km/h
        carros[1].cor = "Vermelha";

        // Usando um loop para imprimir os atributos dos carros
        for (int i = 0; i < carros.length; i++) {
            System.out.println("Carro " + (i + 1) + ": ");
            System.out.println("Marca: " + carros[i].marca);
            System.out.println("Modelo: " + carros[i].modelo);
            System.out.println("Velocidade Máxima: " + carros[i].velocidademaxima + " km/h");
            System.out.println("Cor: " + carros[i].cor);
            System.out.println(); // Linha em branco para separar os carros
        }
    }
}

