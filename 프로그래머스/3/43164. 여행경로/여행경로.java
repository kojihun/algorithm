import java.util.*;

class Solution {
    static ArrayList<String> allRoutes = new ArrayList<>(); // 모든 가능한 경로를 저장하는 리스트입니다.
    static boolean[] usedTickets; // 각 티켓이 사용되었는지 여부를 나타내는 배열입니다.

    public String[] solution(String[][] tickets) {
        usedTickets = new boolean[tickets.length]; // 티켓 수만큼의 크기로 사용 여부 배열을 초기화합니다.

        dfs(0, "ICN", "ICN", tickets); // 깊이 우선 탐색을 통해 모든 가능한 경로를 찾습니다.

        Collections.sort(allRoutes); // 경로들을 사전순으로 정렬합니다.

        return allRoutes.get(0).split(" "); // 사전순으로 정렬된 경로 중 가장 먼저 나온 경로를 반환합니다.
    }

    static void dfs(int depth, String currentAirport, String path, String[][] tickets) {
        if (depth == tickets.length) { // 모든 티켓을 사용한 경우
            allRoutes.add(path); // 현재 경로를 저장합니다.
            return;
        }

        for (int i = 0; i < usedTickets.length; i++) {
            if (!usedTickets[i] && currentAirport.equals(tickets[i][0])) { // 사용하지 않은 티켓 중 출발지가 현재 공항과 같은 경우
                usedTickets[i] = true; // 해당 티켓을 사용했다고 표시합니다.
                dfs(depth + 1, tickets[i][1], path + " " + tickets[i][1], tickets); // 다음 공항으로 이동하며 경로를 업데이트합니다.
                usedTickets[i] = false; // 해당 티켓을 다시 사용 가능하도록 표시합니다.
            }
        }
    }
}
