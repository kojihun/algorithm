class Solution {
    public static int answer = 0;
    public int solution(int[] numbers, int target) {
        BFS(numbers, target, 0, 0);
        return answer;
    }
    
    public static void BFS(int[] numbers, int target, int index, int sum) {
        if(sum == target && index == numbers.length) {
            answer++;
            return;
        }
        
        if(index > numbers.length - 1) {
            return;
        }
        
        BFS(numbers, target, index + 1, sum + numbers[index]);
        BFS(numbers, target, index + 1, sum + (numbers[index] * -1));
    }
}