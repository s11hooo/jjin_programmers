package kopo.luna;

public class BirthYearCalculator {
    public static void main(String[] args) {
        int age = 40;
        System.out.println(Solution(age));
    }
            static int Solution(int age) {
                int answer = 2023 - age ;
            return answer;
        }
    }
