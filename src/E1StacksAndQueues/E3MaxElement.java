package E1StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class E3MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numberOfCommands; i++) {
            String input = scanner.nextLine();
            int command = Integer.parseInt(input.split(" ")[0]);

            if (command == 1) {
                int value = Integer.parseInt(input.split(" ")[1]);
               stack.push(value);

            } else if (command == 2 && !stack.isEmpty()) {
                stack.pop();

            } else {
                int maxValue = Integer.MIN_VALUE;
                for (Integer number : stack) {
                    if (number > maxValue) {
                        maxValue = number;
                }
                }
                System.out.println(maxValue);
            }
        }
    }
}
