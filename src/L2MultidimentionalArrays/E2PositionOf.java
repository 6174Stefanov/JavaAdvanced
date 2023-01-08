package L2MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E2PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimentions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer :: parseInt).toArray();

        int rows = dimentions[0];
        int columns = dimentions[1];

        int [][] matrix = new int [rows][columns];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer :: parseInt).toArray();
            
        }

        int keyNumber = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                int currentNumber = matrix[r][c];
                if (currentNumber == keyNumber) {
                    System.out.println(r + " " + c);
                    isFound = true;
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }
    }
}