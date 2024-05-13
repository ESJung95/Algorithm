import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Solution {
    
    public int[] solution(String today, String[] terms, String[] privacies) {
        // 약관 유효기간을 저장할 Map 생성
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] splitTerm = term.split(" ");
            termMap.put(splitTerm[0], Integer.parseInt(splitTerm[1]));
        }
        
        // 오늘 날짜를 LocalDate 객체로 변환
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate todayDate = LocalDate.parse(today, formatter);
        
        // 파기 대상 개인정보 번호를 저장할 List 생성
        List<Integer> toBeDestroyed = new ArrayList<>();
        
        // 개인정보 수집 일자를 확인하여 파기 대상 결정
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            LocalDate collectionDate = LocalDate.parse(privacy[0], formatter);
            int validityPeriod = termMap.get(privacy[1]);
            LocalDate expirationDate = collectionDate.plusMonths(validityPeriod);
            
            if (todayDate.isAfter(expirationDate) || todayDate.isEqual(expirationDate)) {
                toBeDestroyed.add(i + 1); // 1부터 시작하는 인덱스
            }
        }
        
        // List를 배열로 변환하여 반환
        int[] result = new int[toBeDestroyed.size()];
        for (int i = 0; i < toBeDestroyed.size(); i++) {
            result[i] = toBeDestroyed.get(i);
        }
        
        return result;
    }
}
