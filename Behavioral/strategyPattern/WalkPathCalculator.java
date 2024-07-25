package main.java.strategyPattern;

public class WalkPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Walking Path");
    }
}
