package chapter_1.main;

import java.util.Iterator;

public class Stack_Node<T> implements Iterable<T> {
    private Node p;
    private int N;
    private class Node{
        private T value;
        private Node next;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    public void push(T item){
        Node old = p;
        p = new Node();
        p.value = item;
        p.next = old;
        N++;
    }
    public T pop(){
        T item = p.value;
        p = p.next;
        N--;
        return item;
    }
    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T> {
        private Node current = p;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T item = current.value;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {

        }
    }

    @Override
    public String toString() {
        return "Stack_Node{" +
                "p=" + p +
                ", N=" + N +
                '}';
    }

    public static void main(String[] args) {
        Stack_Node<Integer> stack = new Stack_Node();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
       for (int x : stack){
           System.out.println(x);
       }
    }
}
