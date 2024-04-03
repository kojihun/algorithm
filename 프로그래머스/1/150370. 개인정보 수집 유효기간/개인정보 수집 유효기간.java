import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> expiredPrivacies = new ArrayList<>();
        String[] todayParts = today.split("\\.");
        int currentYear = Integer.parseInt(todayParts[0]);
        int currentMonth = Integer.parseInt(todayParts[1]);
        int currentDay = Integer.parseInt(todayParts[2]);
        
        Map<String, Integer> termsMap = parseTerms(terms);

        for (int i = 0; i < privacies.length; i++) {
            String[] privacyParts = privacies[i].split(" ");
            String[] dateParts = privacyParts[0].split("\\.");
            int year = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int day = Integer.parseInt(dateParts[2]);
            
            int term = termsMap.get(privacyParts[1]);
            int[] updatedDate = updateDate(year, month, day, term);
            year = updatedDate[0];
            month = updatedDate[1];
            day = updatedDate[2];
            
            if (year < currentYear || 
                (year == currentYear && (month < currentMonth || (month == currentMonth && day < currentDay)))) {
                expiredPrivacies.add(i + 1);
            }
        }

        return expiredPrivacies.stream().mapToInt(Integer::intValue).toArray();
    }

    private Map<String, Integer> parseTerms(String[] terms) {
        Map<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] parts = term.split(" ");
            termsMap.put(parts[0], Integer.parseInt(parts[1]));
        }
        return termsMap;
    }

    private int[] updateDate(int year, int month, int day, int term) {
        month += term;
        if (month > 12) {
            year += (month - 1) / 12;
            month = (month - 1) % 12 + 1;
        }
        
        if (day == 1) {
            month--;
            if (month == 0) {
                month = 12;
                year--;
            }
            day = daysInMonth(year, month);
        } else {
            day--;
        }
        
        return new int[]{year, month, day};
    }
    
    private int daysInMonth(int year, int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
            default:
                return -1;
        }
    }
}
