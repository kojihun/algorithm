import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerIndices = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndices.put(players[i], i);
        }
        
        for (String calling : callings) {
            int index = playerIndices.get(calling);
            String tempPlayer = players[index - 1];
            players[index - 1] = players[index];
            players[index] = tempPlayer;
            
            playerIndices.put(players[index - 1], index - 1);
            playerIndices.put(players[index], index);
        }
        
        return players;
    }
}
