import java.util.*;
class Solution {
    public int[] solution(String s) {

        ArrayList<String> strList = new ArrayList<>();
        for (String item : s.split("")) {
            strList.add(item);
        }

        int[] result = new int[2];
        int zeroCnt = 0;
        int cnt = 0;

        while (!s.equals("1")) {
            cnt++;
            for (int i = 0; i < strList.size(); i++) {
                if (strList.get(i).equals("0")) {
                    zeroCnt++;
                }
            }

            s = s.replace("0", "");
            int c = s.length();
            s = Integer.toBinaryString(c);

            strList.clear();
            for (String item : s.split("")) {
                strList.add(item);
            }


        }

        result[0] = cnt;
        result[1] = zeroCnt;
        
        return result;
    }
}