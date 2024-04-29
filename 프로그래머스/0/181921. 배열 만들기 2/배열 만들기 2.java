import java.util.*;
import java.util.regex.*;
class Solution {
    public int[] solution(int l, int r) {
        // l이상 r이하의 정수 중에서 숫자 0과 5로만 이루어진 정수를 오름차순으로 저장한 배열 return
        ArrayList<Integer> list = new ArrayList<>();
        // 정규식 패턴 생성
        Pattern pattern = Pattern.compile("[05]+");
        
        for (int i = l; i <= r; i++) {
            String num = String.valueOf(i);
            Matcher matcher = pattern.matcher(num);
            
            if (matcher.matches()) {
                list.add(i);
            }
        }
        
        int[] none = new int[1];
        if (list.size() == 0) {
            none[0] = -1;
            return none;
        }
        
        int[] result = new int[list.size()];
        int index = 0;
        for (int item : list) {
            result[index] = item;
            index++;
        }
        
        return result;
    }
}
