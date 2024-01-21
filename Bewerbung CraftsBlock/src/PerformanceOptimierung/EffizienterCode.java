package PerformanceOptimierung;

import java.util.ArrayList;
import java.util.List;

public class EffizienterCode {

    public static void main(String[] args) {
        List<Integer> numbers = generateNumbers(1000000);
        int result = sumList(numbers);
        System.out.println("Summe: " + result);
    }

    public static List<Integer> generateNumbers(int n) {
        List<Integer> numbers = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    public static int sumList(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum = addTwoNumbers(sum, num);
        }
        return sum;
    }

    public static int addTwoNumbers(int a, int b) {
        return (a + b) * 2;
    }
}
