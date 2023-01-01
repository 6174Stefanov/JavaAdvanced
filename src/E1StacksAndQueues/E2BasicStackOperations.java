package E1StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class E2BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(" ");
        int numbersToPush = Integer.parseInt(input[0]);
        int numbersToPop = Integer.parseInt(input[1]);
        int numberToCheck = Integer.parseInt(input[2]);

        Deque<Integer> stack = new ArrayDeque<>();
        String[] numbersToAdd = scanner.nextLine().split(" ");

        for (int i = 0; i < numbersToPush; i++) {
            stack.push(Integer.valueOf(numbersToAdd[i]));
        }
        for (int i = 0; i < numbersToPop; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println("0");
        } else if (stack.contains(numberToCheck)) {
            System.out.println(true);
        } else {
            int minElement = Integer.MAX_VALUE;
            for (Integer number : stack) {
                if (number < minElement) {
                    minElement = number;
                }
            }
            System.out.println(minElement);
        }
    }
}
