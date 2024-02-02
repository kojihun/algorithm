import java.util.*;

class Solution
{
    public int solution(int[] A, int[] B)
    {
        Arrays.sort(A);
        Arrays.sort(B);   
        reverseSort(B);
        
        int answer = 0;
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
    
    public static void reverseSort(int[] B) {
        int left = 0;
        int right = B.length - 1;

        while (left < right) {
            int temp = B[left];
            B[left] = B[right];
            B[right] = temp;

            left++;
            right--;
        }
    }
}