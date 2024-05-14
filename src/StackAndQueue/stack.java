package StackAndQueue;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(4);

        System.out.println("contains : " + stack.contains(2)); // 2라는 숫자 존재여부 판단 있으면 true
        System.out.println(stack);
        System.out.println("peek : " + stack.peek());          // 스택의 가장 상단의 값 출력하고 제거하지 않음
        System.out.println(stack);
        System.out.println("pop : " + stack.pop());            // 스택의 가장 상단의 값 출력하고 제거함

        System.out.println(stack);
        stack.clear();                         // 초기화
        System.out.println(stack);
        System.out.println(stack.isEmpty());   // 비어있는지 판단 비어있으면 true
    }
}
