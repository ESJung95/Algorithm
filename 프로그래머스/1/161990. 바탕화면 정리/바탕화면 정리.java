import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        
        int[] result = new int[4];
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        result[0] = Collections.min(row);
        result[1] = Collections.min(col);
        result[2] = Collections.max(row) + 1;
        result[3] =Collections.max(col) + 1;
        return result;
    }
}