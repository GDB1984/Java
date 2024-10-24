public class Main {
    public static void main(String[] args) {
        // Instanciando os objetos Carro
        Carro hondaCivic = new Carro();
        hondaCivic.marca = "Honda";
        hondaCivic.modelo = "Civic";
        hondaCivic.velocidademaxima = 210; // em km/h
        hondaCivic.cor = "Preto";

        Carro ferrari = new Carro();
        ferrari.marca = "Ferrari";
        ferrari.modelo = "Ferrari Enzo";
        ferrari.velocidademaxima = 350; // em km/h
        ferrari.cor = "Vermelha";

        // Imprimindo os atributos dos carros
        System.out.println("Carro 1: ");
        System.out.println("Marca: " + hondaCivic.marca);
        System.out.println("Modelo: " + hondaCivic.modelo);
        System.out.println("Velocidade Máxima: " + hondaCivic.velocidademaxima + " km/h");
        System.out.println("Cor: " + hondaCivic.cor);
        
        System.out.println("\nCarro 2: ");
        System.out.println("Marca: " + ferrari.marca);
        System.out.println("Modelo: " + ferrari.modelo);
        System.out.println("Velocidade Máxima: " + ferrari.velocidademaxima + " km/h");
        System.out.println("Cor: " + ferrari.cor);
    }
}
