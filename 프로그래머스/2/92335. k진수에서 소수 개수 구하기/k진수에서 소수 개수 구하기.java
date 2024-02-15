import java.util.*;
import java.math.*;

class Solution {
    public int solution(int n, int k) {
        // 1. 정수 n을 k진수로 변환하기
        String convertN = Integer.toString(n, k);
        
        // 2. 0을 기준으로 잘라서 배열에 넣고, 해당 수가 소수인지만 판별하면 되지 않을까?
        int answer = 0;
        
        String[] convertNArray = convertN.split("0");
        for(int i = 0; i < convertNArray.length; i++) {
            if(!convertNArray[i].trim().equals("")) {
                if(sieveOfEratosthenes(new BigInteger(convertNArray[i]))) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    public static boolean sieveOfEratosthenes(BigInteger n) {
        return n.isProbablePrime(100);
    }
}