import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        
        int[] result = new int[4];
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        
        // index == 행 , #위치 == 열
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        result[0] = Collections.min(row); // 행
        result[1] = Collections.min(col); // 열
        
        result[2] = Collections.max(row) + 1;
        result[3] = Collections.max(col) + 1;
        
        return result;
    }
}