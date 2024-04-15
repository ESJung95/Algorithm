import java.util.*;
class Solution {
    public String solution(String code) {
        
        // 문자가 1이면 모드 변경 - 시작 모드는 0
        String mode = "0";
        ArrayList<String> list = new ArrayList<>();
        for (String item : code.split("")) {
            list.add(item);
        }
        
        // System.out.println(list);
        StringBuilder ret = new StringBuilder();
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("1")) {
                if (mode.equals("0")) {
                    mode = "1";
                } else {
                    mode = "0";
                }
            } else {
                if (mode.equals("0")) {
                    if (i % 2 == 0) {
                        ret.append(list.get(i));
                    }
                } else {
                    if (i % 2 != 0) {
                        ret.append(list.get(i));
                    }
                }
            }
        }
        String result = ret.toString();
        
        if (result.length() == 0) {
            return "EMPTY";
        } 
        return result;
    }
}