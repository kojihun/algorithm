class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String masked = phone_number.substring(0, length - 4).replaceAll(".", "*");
        return masked + phone_number.substring(length - 4);
    }
}
