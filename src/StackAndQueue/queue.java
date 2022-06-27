package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.offer(2);
        System.out.println(queue);

        queue.poll();
        queue.poll();   // null
        // queue.remove(); 큐에 값이 비어있으면 java.util.NoSuchElementException 에러
        System.out.println(queue);

        queue.add(3);
        queue.add(10);
        System.out.println(queue);
        queue.clear(); // 초기화
        System.out.println(queue);

        queue.add(23);
        queue.add(134);
        System.out.println(queue);
        System.out.println(queue.peek());
    }

}
