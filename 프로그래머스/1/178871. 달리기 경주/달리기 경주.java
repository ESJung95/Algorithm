import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> player = new HashMap<>(); // key값이 선수
        HashMap<Integer, String> rank = new HashMap<>(); // key값이 등수
        
        // map에 값 초기화
        for (int i = 0; i < players.length; i++) {
            player.put(players[i], i);
            rank.put(i, players[i]);
        }
        
        for (int i = 0; i < callings.length; i++) {
            
            // 추월한 선수 이름 
            String name = callings[i];
            // 추월한 선수 등수
            int curRank = player.get(name);
            
            // 앞에 선수 등수
            int frontRank = curRank - 1;
            // 앞에 선수 등수 이름
            String frontName = rank.get(curRank - 1);
            
            // 바꿔주기
            rank.put(frontRank, name);
            rank.put(curRank, frontName);
            
            player.put(name, frontRank);
            player.put(frontName, curRank);
            
        }
        
        // 결과배열 : rank순서 대로 선수이름 출력
        String[] result = new String[rank.size()];
        for (int i = 0; i < rank.size(); i++) {
            result[i] = rank.get(i);
        }
        
        return result;
    }
}