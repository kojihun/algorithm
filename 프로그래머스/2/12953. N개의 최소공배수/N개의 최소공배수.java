import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        // 주어진 숫자들의 최소공배수 계산
        int lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            lcm = calculateLCM(lcm, numbers[i]);
        }
        return lcm;
    }
    
    // 최대공약수 구하기
    private int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // 최소공배수 구하기
    private int calculateLCM(int a, int b) {
        return a * b / calculateGCD(a, b);
    }
}