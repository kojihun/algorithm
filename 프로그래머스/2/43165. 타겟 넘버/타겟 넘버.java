class Solution {
    public static int answer = 0;
    public int solution(int[] numbers, int target) {
        DFS(numbers, target, 0, 0);
        return answer;
    }
    
    public static void DFS(int[] numbers, int target, int index, int sum) {
        if(index == numbers.length) {
            if(target == sum) {
                answer++;
            }
            return;
        }
        
        DFS(numbers, target, index + 1, sum + numbers[index]);
        DFS(numbers, target, index + 1, sum - numbers[index]);
    }
}