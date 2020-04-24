package chapter_1.exercise;

public class Counter {
    private String name;
    private int total = 0;

    Counter(String name) {
        this.name = name;
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