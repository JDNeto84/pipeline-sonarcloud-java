package org.javaTestUnit;
public class Main {
    public static void main(String[] args) {

        Integer n1 = 11, n2 = 11;
        Main calculation = new Main();
        Integer resultAddition = calculation.addition(n1, n2);
        System.out.println("Result of Addition: " + resultAddition);
    }
    public Integer addition(Integer n1, Integer n2) {
        return n1 + n2;
    }
}