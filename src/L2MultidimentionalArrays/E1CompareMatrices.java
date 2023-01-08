package L2MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E1CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimentions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer :: parseInt).toArray();

        int arraysCount = dimentions[0];
        int sizeOfArray = dimentions[1];
        int [][] matrix = new int[arraysCount][sizeOfArray];

        int[] firstArr = matrix[0];
        int[] secondArr = matrix[1];

        for (int i = 0; i < arraysCount; i++) {
            int[] currentArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer :: parseInt).toArray();
            matrix[i] = currentArr;
        }
        boolean areEqual = matrix[0].length == matrix[1].length;

        if (areEqual) {
            areEqual = areArraysEqual(matrix, areEqual);
        }
        System.out.println(areEqual ? "equal" : "not equal");
    }

    private static boolean areArraysEqual(int[][] matrix, boolean areEqual) {
        for (int r = 0; r < matrix[0].length; r++) {

            int[] firstArr = matrix[0];
            int[] secondArr = matrix[1];

            if (firstArr.length != secondArr.length) {
                return false;
            }
            for (int i = 0; i < firstArr.length; i++) {
                int firstNum = firstArr[i];
                int secondNum = secondArr[i];
                if (firstNum != secondNum) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printMatirx (int[][] matrix) {
        for (int[] arr : matrix) {
            for (int num : arr) {
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }
}
