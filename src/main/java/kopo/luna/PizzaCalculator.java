package kopo.luna;

public class PizzaCalculator {
    public static void main(String[] args) {
    }
    static int solution(int n) {
        if (n % 7 == 0) {
            return n / 7;
        } else {
            return n / 7 + 1;
        }
    }
}
