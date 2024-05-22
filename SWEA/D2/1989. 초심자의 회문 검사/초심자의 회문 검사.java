import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();  // 버퍼 비우기

        for (int test_case = 1; test_case <= T; test_case++) {
            String text = sc.nextLine();
            int len = text.length();
            boolean isPalindrome = true;

            for (int i = 0; i < len / 2; i++) {
                if (text.charAt(i) != text.charAt(len - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            int result = isPalindrome ? 1 : 0;
            System.out.println("#" + test_case + " " + result);
        }
    }
}