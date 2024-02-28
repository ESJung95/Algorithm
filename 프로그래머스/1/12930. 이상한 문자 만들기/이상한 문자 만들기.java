import java.util.*;
class Solution {
    public String solution(String s) {
        
        ArrayList<String> list = new ArrayList<>();
        for (String item : s.split(" ", -1)) {
            list.add(item);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < list.size(); i++) {
            
            if (list.get(i).equals("")) {
                sb.append(" ");
            }
            
            int cnt = 0;
            for (String item : list.get(i).split("")) {
                
                cnt++;
                if (cnt % 2 == 0) {
                    sb.append(item.toLowerCase());
                } else {
                    sb.append(item.toUpperCase());
                }
                if (list.get(i).length() == cnt) {
                    sb.append(" ");
                }

            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();

    }
}
