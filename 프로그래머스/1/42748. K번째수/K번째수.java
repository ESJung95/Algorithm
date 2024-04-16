import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] result = new int[commands.length];
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        
        for (int i = 0; i < commands.length; i++) {
            
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                list.add(array[j-1]);
            }
            Collections.sort(list);
            System.out.println(list);
            result[index] = list.get(commands[i][2]-1);
            index++;
            list.clear();
        }
        
        return result;
    }
}