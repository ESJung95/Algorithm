import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        
        String[] possible = {"aya", "ye", "woo", "ma"};
        String[] impossible ={"ayaaya", "yeye", "woowoo", "mama"};
        int result = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < impossible.length; j++) {
                if (babbling[i].contains(impossible[j])) {
                    babbling[i] = babbling[i].replace(impossible[j], "1");
                }
            }
            
           
            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace(" ", "");
            
            if (babbling[i].length() == 0) {
                result++;
            }
        }
        
        return result;
    }
}