package chapter_1.exercise;

import java.util.Arrays;
import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private T[] a;
    private int N;

    public Stack(int cap) {
        this.a = (T[]) new Object[cap];
    }

    public static void main(String[] args) {
        Stack<String> fixedCap = new Stack(10);
        fixedCap.push("to");
        fixedCap.push("be");
        fixedCap.push("or");
        fixedCap.push("not");
        for (String item : fixedCap){
            System.out.println(item);
        }
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }
    private void resize(int max){
        T[] temp = (T[]) new Object[max];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        this.a = temp;
    }
    public void push(T s) {
        if (N == a.length) this.resize(a.length * 2);
        this.a[N++] = s;
    }

    public T pop() {
        T item = this.a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) resize(a.length/2);
        return item;
    }

    @Override
    public String toString() {
        return "FixedCapacityStackOfStrings{" +
                "a=" + Arrays.toString(a) +
                ", N=" + N +
                '}';
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T> {
        private int i = N;
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public T next() {
            return a[--i];
        }

        @Override
        public void remove() {

        }
    }
}
