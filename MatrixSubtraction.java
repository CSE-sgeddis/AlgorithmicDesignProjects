/*
 * Written by Shalin Geddis
 */
import java.util.Scanner;
public class MatrixSubtraction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		// Creating the matrices
        int[][] matrixA = createMatrix(scanner, "A");
        int[][] matrixB = createMatrix(scanner, "B");

        // Subtracting the matrices
        int[][] resultMatrix = subtractMatrices(matrixA, matrixB);

        // Printing the matrices
        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println();

        System.out.println("Matrix B:");
        printMatrix(matrixB);
        System.out.println();

        System.out.println("Result Matrix:");
        printMatrix(resultMatrix);
    }

    public static int[][] createMatrix(Scanner scanner, String matrixName) {
        System.out.println("Enter the dimensions of Matrix " + matrixName + ":");
        System.out.print("Number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the components of Matrix " + matrixName + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrixName + "[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Error: Matrices must have the same dimensions for subtraction.");
            System.exit(0);
        }

        int rows = matrixA.length;
        int columns = matrixA[0].length;

        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        return resultMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}