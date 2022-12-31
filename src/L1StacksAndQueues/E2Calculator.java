package L1StacksAndQueues;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class E2Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            int result = 0;
            String currentChar = String.valueOf(input.charAt(i));
            if (Character.isDigit(input.charAt(i))) {
                numbers.push((int) input.charAt(i));
            }
            String action = String.valueOf(input.charAt(i+2));
            if (action.contains("-")) {
                result = numbers.pop() - Integer.parseInt(String.valueOf(input.charAt(i+4)));
                numbers.push(result);
            }
            System.out.println(result);

        }
    }
}
