class Solution {
    public int solution(String[] spell, String[] dic) {
        // 존재 1 존재하지 않으면2
        int cnt = 0;
        int result = 2;
        for (int i = 0; i < dic.length; i++) {
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].length() == spell.length) {
                    if (dic[i].contains(spell[j])) {
                        cnt ++;
                    }
                }
            }
            
            if (cnt == spell.length) {
                result = 1;
            }
            cnt = 0;
        }
        
        return result;
    }
}