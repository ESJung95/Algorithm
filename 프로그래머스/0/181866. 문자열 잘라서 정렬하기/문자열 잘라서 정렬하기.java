import java.util.*;
class Solution {
    public String[] solution(String myString) {

        String[] arr = new String[myString.length() + 1];
        int index = 0;
        for (String item : myString.split("")) {
            arr[index] = item;
            index++;
        }
        arr[arr.length - 1] = "x";
        ;
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("x")) {
                sb.append(arr[i]);
            } else {
                if (!sb.toString().equals("")) {
                    list.add(sb.toString());
                }
                sb.setLength(0);
            }
        }

        String[] result = new String[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        
        Arrays.sort(result);
        return result;
    }
}
