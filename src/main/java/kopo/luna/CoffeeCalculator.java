package kopo.luna;

import java.util.Arrays;

public class CoffeeCalculator {
    public static void main(String[] args) {
        int money = 5500;
        System.out.println(Arrays.toString(Solution(money)));
    }
    static int[] Solution(int money) {

        int coffee = money / 5500;
        int remain = money % 5500;

        int[] answer = {coffee, remain};

        return answer;
    }

}
