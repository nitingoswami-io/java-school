package com.backto.school.datastructure;

public class FixedSizeQueue {
    private final int[] queue;
    private int n;
    private int front;
    private int rear;

    public FixedSizeQueue(int capacity) {
        queue = new int[capacity];
        n = 0;
        front = 0;
        rear = 0;
    }
    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        queue[rear++] = item;
        n++;
    }
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int item = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        n--;
        return item;
    }
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }
    public boolean isEmpty() {
        return n == 0;
    }
    public boolean isFull() {
        return n == queue.length;
    }
}