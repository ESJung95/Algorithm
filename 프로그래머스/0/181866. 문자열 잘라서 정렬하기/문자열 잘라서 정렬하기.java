import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        String[] split = myString.split("x");
        ArrayList<String> list = new ArrayList <> ();

        for(int i = 0; i < split.length; i ++){
            if(!split[i].equals("")){
                list.add(split[i]);
            }

        }
    
        String[] result = new String[list.size()];
        for(int i = 0; i < result.length; i ++){
            result[i] = list.get(i);
        }
        Arrays.sort(result);


        return result;
    }
}
