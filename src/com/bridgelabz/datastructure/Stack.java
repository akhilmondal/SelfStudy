package com.bridgelabz.datastructure;

public class Stack<T> {

    LinkedList<T> linkedList;

    public Stack() {
        linkedList = new LinkedList<>();
    }

    public void push(T data) {
        linkedList.push(data);
    }

    public T pop() {
        return null;
    }
}
