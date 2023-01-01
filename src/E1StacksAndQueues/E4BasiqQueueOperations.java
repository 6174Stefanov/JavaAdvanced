package E1StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class E4BasiqQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int countToOffer = Integer.parseInt(input.split(" ")[0]);
        int countToPoll = Integer.parseInt(input.split(" ")[1]);
        int elementToSearch = Integer.parseInt(input.split(" ")[2]);

        Deque<Integer> que = new ArrayDeque<>();
        String [] numbersToAdd = scanner.nextLine().split(" ");
        for (int i = 0; i < countToOffer; i++) {
            que.offer(Integer.parseInt(numbersToAdd[i]));
        }
        for (int i = 0; i < countToPoll; i++) {
            que.poll();
        }
        if (que.isEmpty()) {
            System.out.println("0");
        } else if (que.contains(elementToSearch)) {
            System.out.println(true);
        } else {
            int minElement = Integer.MAX_VALUE;
            for (Integer number : que) {
                if (number < minElement) {
                    minElement = number;
                }
            }
            System.out.println(minElement);
        }
    }
}
