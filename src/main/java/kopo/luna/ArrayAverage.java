package kopo.luna;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        double result = solution(numbers);

        System.out.println(result);

    }
    static  double solution(int[] numbers) {

        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }

        return (double) sum / numbers.length;
    }
}
