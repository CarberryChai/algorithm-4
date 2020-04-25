package chapter_1.exercise;

public class Counter {
    private String name;
    private int total;

    Counter(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Counter c = new Counter("one");
        System.out.println(c);
    }

    public void increase() {
        this.total += 1;
    }

    public int tally() {
        return this.total;
    }

    public String toString() {
        return this.name + " " + this.total;
    }
}