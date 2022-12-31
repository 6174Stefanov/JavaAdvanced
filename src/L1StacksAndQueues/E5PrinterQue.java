package L1StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E5PrinterQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> que = new ArrayDeque<>();

        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                String output = que.isEmpty()
                        ? "Printer is on standby"
                        : "Canceled " + que.poll();
                System.out.println(output);
            } else {
                que.offer(input);
            }


            input = scanner.nextLine();
        }
        for (String file : que) {
            System.out.println(file);
        }
    }
}
