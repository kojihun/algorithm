class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        // 1. 주어진 쿠폰을 사용하여 먹을 수 있는 치킨의 개수 계산
        answer += chicken / 10;
        
        // 2. 남은 쿠폰으로 추가로 먹을 수 있는 치킨의 개수 계산
        int remainCoupon = chicken % 10;
        while (chicken >= 10) {
            chicken = chicken / 10 + remainCoupon;
            answer += chicken / 10;
            remainCoupon = chicken % 10;
        }
        
        // 3. 먹을 수 있는 치킨의 총 개수 반환
        return answer;
    }
}