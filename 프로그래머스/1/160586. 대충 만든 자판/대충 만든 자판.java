import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> keyPressCount = new HashMap<>();

        // Map에 각 키에 할당된 문자와 최소 키 누름 횟수 저장
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char ch = key.charAt(i);
                keyPressCount.put(ch, Math.min(keyPressCount.getOrDefault(ch, Integer.MAX_VALUE), i + 1));
            }
        }

        int[] answer = new int[targets.length];

        // 각 문자열을 작성하기 위한 키 누름 횟수 계산
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int pressCount = 0;

            for (char ch : target.toCharArray()) {
                if (!keyPressCount.containsKey(ch)) {
                    pressCount = -1;
                    break;
                }
                pressCount += keyPressCount.get(ch);
            }

            answer[i] = pressCount;
        }

        return answer;
    }
}