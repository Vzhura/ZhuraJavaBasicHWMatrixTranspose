import java.util.Random;
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Random random = new Random();
        int M, N;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введіть кількість рядків (M): ");
            M = scanner.nextInt();
            System.out.print("Введіть кількість стовпців (N): ");
            N = scanner.nextInt();
        }

        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Перша матриця:");
        printMatrix(matrix);

        int[][] transposedMatrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("(Друга) транспонована матриця:");
        printMatrix(transposedMatrix);
    }
    public static void printMatrix(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
