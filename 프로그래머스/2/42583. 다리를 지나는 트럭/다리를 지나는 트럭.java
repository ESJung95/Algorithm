import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        // 순서가 정해진 모든 트럭이 다리를 건너려면 최소 몇초가 걸리는지 return
        int answer = 0;
        int[] bridge = new int[bridge_length];
        int foreIndex = 0;
        int count = 0;
        
        while (count < truck_weights.length) {
            answer++; 

            if(bridge[0] > 0) { 
                bridge[0] = 0;
                count++;
            }

            int totalWeight = 0; 
            for(int i = 0; i < bridge_length - 1; i++) { 
                bridge[i] = bridge[i+1];
                bridge[i+1] = 0;
                totalWeight += bridge[i];
            }

            if(bridge[bridge_length - 1] == 0) { 
                if(foreIndex < truck_weights.length && totalWeight + truck_weights[foreIndex] <= weight) {
                    bridge[bridge.length - 1] = truck_weights[foreIndex]; 
                    foreIndex++; 
                }
            }
        }

        return answer;
    }
}