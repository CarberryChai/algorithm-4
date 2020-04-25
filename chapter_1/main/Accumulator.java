package chapter_1.main;

import edu.princeton.cs.algs4.StdRandom;

public class Accumulator {
    private int times;
    private double total;
    public Accumulator() {
    }
    public void addDataValue(double val){
        this.total += val;
        this.times++;
    }
    public double mean(){
        return this.total / this.times;
    }

    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        Accumulator acc = new Accumulator();
        for (int i = 0; i < T; i++) {
            acc.addDataValue(StdRandom.uniform());
        }
        System.out.println(acc);
    }
    @Override
    public String toString() {
        return "Mean ( " +
                times + " values ) : " +
              String.format("%7.5f",  this.mean());
    }
}
