package com.backto.school.datastructure;

public class FixedSizeStack {
    private final int[] stack;
    private int n;


    public FixedSizeStack(int capacity) {
        stack = new int[capacity];
        n = 0;
    }
    public void push(int item) {
        stack[n++] = item;
    }
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[--n];
    }
    public int peek() {
        return stack[n - 1];
    }
    public boolean isEmpty() {
        return n == 0;
    }
    public boolean isFull() {
        return n == stack.length;
    } 
}  