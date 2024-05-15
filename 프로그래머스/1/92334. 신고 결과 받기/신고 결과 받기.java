import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        // 내가 신고한 id의 처리결과 메일을 받는 횟수 return
        Set<String> set = new HashSet<>();
        for (String item : report) {
            set.add(item);
        }
        
        // set으로 중복 제거하고 다시 배열에 담아주기
        String[] newReport = new String[set.size()];
        int index = 0;
        for (String item : set) {
            newReport[index] = item;
            index++;
        }
        
        // 신고당한 횟수 cnt
        Map<String, Integer> cnt = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            cnt.put(id_list[i], 0);
        }
        
        // 신고당한 id , 횟수 저장
        for(int i = 0; i < newReport.length; i++) {
            String[] temp = newReport[i].split(" ");
            cnt.put(temp[1], cnt.get(temp[1]) + 1);
        }
        
        // 신고당한 횟수가 k번 이상인 key값만 저장하기
        List<String> stopId = new ArrayList<>();
        
        for (int i = 0; i < id_list.length; i++) {
            if (cnt.get(id_list[i]) >= k) {
                stopId.add(id_list[i]);
            }
        }
        
        // stopId가 없을 때 바로 return 
        int[] result = new int[id_list.length];
        if (stopId.size() == 0) {
            return result;
        }
        
        // 처리결과 메일 횟수 cnt
        Map<String, Integer> resultCnt = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            resultCnt.put(id_list[i], 0);
        }
        
        for (int i = 0; i < newReport.length; i++) {
            String[] temp = newReport[i].split(" ");
            for (int j = 0; j < stopId.size(); j++) {
                if (temp[1].equals(stopId.get(j))) {
                    resultCnt.put(temp[0], resultCnt.get(temp[0]) + 1);
                }
            }
        }
        
        // result 배열에 순서대로 담기
        for (int i = 0; i < id_list.length; i++) {
            result[i] = resultCnt.get(id_list[i]);
        }
        
        return result;
    }
}