class Solution {
    public String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase();
        
        // 2단계
        String regex = "[^a-z0-9-_.]";
        new_id = new_id.replaceAll(regex, "");
        
        // 3단계
        new_id = new_id.replaceAll("\\.{2,}", ".");
        
        // 4단계
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        
        // 5단계
        if (new_id.isEmpty()) {
            new_id = "a";
        }
        
        // 6단계
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }
        new_id = new_id.replaceAll("\\.$", "");

        
        // 7단계
        while (new_id.length() <= 2) {
            new_id += new_id.charAt(new_id.length() - 1);
        }

        return new_id;
    }
}