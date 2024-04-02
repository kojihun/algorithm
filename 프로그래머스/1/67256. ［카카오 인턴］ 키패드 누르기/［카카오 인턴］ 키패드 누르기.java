import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        // L: 1, 4, 7, *
        // R: 3, 6, 9, #
        // B: 2, 5, 8, 0
        Map<String, int[]> map = new HashMap<>();
        map.put("1", new int[] {0, 0});
        map.put("2", new int[] {0, 1});
        map.put("3", new int[] {0, 2});
        map.put("4", new int[] {1, 0});
        map.put("5", new int[] {1, 1});
        map.put("6", new int[] {1, 2});
        map.put("7", new int[] {2, 0});
        map.put("8", new int[] {2, 1});
        map.put("9", new int[] {2, 2}); 
        map.put("*", new int[] {3, 0});  
        map.put("0", new int[] {3, 1});  
        map.put("#", new int[] {3, 2});  
        
        String leftHandPos = "*";
        String rightHandPos = "#"; 
        
        StringBuilder sb = new StringBuilder();
        for(int number : numbers) {
            if(number == 1 || number == 4 || number == 7) {
                sb.append("L");
                leftHandPos = String.valueOf(number);
            }else if(number == 3 || number == 6 || number == 9) {
                sb.append("R");
                rightHandPos = String.valueOf(number);
            }else {
                // current number
                int[] currentPos = map.get(String.valueOf(number));
                int currentX = currentPos[0];
                int currentY = currentPos[1];
                
                // left hand
                int[] leftPos = map.get(leftHandPos);
                int leftX = leftPos[0];
                int leftY = leftPos[1];
                int leftMove = Math.abs(currentX - leftX) + Math.abs(currentY - leftY);
                
                // right hand
                int[] rightPos = map.get(rightHandPos);
                int rightX = rightPos[0];
                int rightY = rightPos[1];
                int rightMove = Math.abs(currentX - rightX) + Math.abs(currentY - rightY);
                
                if(leftMove > rightMove) {
                    sb.append("R");
                    rightHandPos = String.valueOf(number);
                }else if(leftMove < rightMove) {
                    sb.append("L");
                    leftHandPos = String.valueOf(number);
                }else {
                    if(hand.equals("left")) {
                        sb.append("L");
                        leftHandPos = String.valueOf(number);
                    }else {
                        sb.append("R");
                        rightHandPos = String.valueOf(number);
                    }
                }
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}