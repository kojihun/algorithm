class Solution {
    public int[] solution(String[] wallpaper) {
        int minWidth = Integer.MAX_VALUE;
        int minHeight = Integer.MAX_VALUE;
        int maxWidth = Integer.MIN_VALUE;
        int maxHeight = Integer.MIN_VALUE;
        
        for(int i = 0; i < wallpaper.length; i++) {
            String[] input = wallpaper[i].split("");
            for(int j = 0; j < input.length; j++) {
                if(input[j].equals("#")) {
                    System.out.print(i + " " + j + " ");
                    if(j < minWidth) {
                        minWidth = j;
                    }
                    if(i < minHeight) {
                        minHeight = i;
                    }
                    if(j >= maxWidth) {
                        maxWidth = j + 1;
                    }
                    if(i >= maxHeight) {
                        maxHeight = i + 1;
                    }
                }
            }
            System.out.println();
        }
        
        int[] answer = new int[4];
        answer[0] = minHeight;
        answer[1] = minWidth;
        answer[2] = maxHeight;
        answer[3] = maxWidth;
        
        return answer;
    }
}