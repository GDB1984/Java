package data_structures.array.examples.multidimensional;

// Array multimensional (matriz)

public class Main {
    public static void main(String[] args) {
        // Declaração de matriz 2x3
        // int[][] matrix = new int[2][3];

        // Declaração de matriz e inicialização de valores
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Elemento na posição [0][0]: " + matrix[0][0]);
        System.out.println("Elemento na posição [1][2]: " + matrix[1][2]);
        System.out.println();

        System.out.println("Matriz completa:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
