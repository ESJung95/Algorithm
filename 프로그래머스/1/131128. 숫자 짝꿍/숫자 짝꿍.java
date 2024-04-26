import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        
        // X, Y 정수 중에서 공통으로 나타나는 정수들을 이용하여 만들 수 있는 가장 큰 정수
        // 짝꿍이 존재하지 않으면 -1 , 0으로만 구성 -> 0
        String result = "-1";
        HashMap<Character, Integer> xMap = new HashMap<>();
        HashMap<Character, Integer> yMap = new HashMap<>();
        
        char[] xArr = X.toCharArray();
        char[] yArr = Y.toCharArray();
        
        for(char item : xArr) {
            if(xMap.containsKey(item)) {
                xMap.put(item, xMap.get(item)+1);
            } else {
                xMap.put(item, 1);
            }
        }
        
        for(char item : yArr) {
            if(yMap.containsKey(item)) {
                yMap.put(item, yMap.get(item)+1);
            } else {
                yMap.put(item, 1);
            }
        }
        
        // System.out.println(xMap);
        // System.out.println(yMap);
        
        ArrayList<Character> xKeys = new ArrayList<>();
        ArrayList<Character> yKeys = new ArrayList<>();
        
        for (char xKey : xMap.keySet()) {
            xKeys.add(xKey);
        }
        
        for (char yKey : yMap.keySet()) {
            yKeys.add(yKey);
        }
        
        // System.out.println(xKeys);
        // System.out.println(yKeys);
        
        ArrayList<Character> same = new ArrayList<>();
        for (char item : xKeys) {
            if (yKeys.contains(item)) {
                same.add(item);
            }
        }
            
            // System.out.println(same); // key값
        if(same.size() == 0) {
            return result;
        } 
        
        ArrayList<Character> resultList = new ArrayList<>();
        for (int i = 0; i < same.size(); i++) {
            if (xMap.get(same.get(i)) >= yMap.get(same.get(i))) {
                // 작은 수로 yMap.get(i) key가 저장되고 value가 반복
                int cnt = 0;
                while(cnt < yMap.get(same.get(i))) {
                    resultList.add(same.get(i));
                    cnt++;
                }
            } else {
                int cnt = 0;
                while(cnt < xMap.get(same.get(i))) {
                    resultList.add(same.get(i));
                    cnt++;
                }
            }
                
        }
        
        
    
        Collections.sort(resultList, Collections.reverseOrder());
        // System.out.print(resultList);
        
        StringBuilder sb = new StringBuilder();
        for (char item : resultList) {
            sb.append(item);
        }
        
        String str = sb.toString();
        if (str.startsWith("0")) {
            return "0";
        }
        
        return str;
        
    }
}