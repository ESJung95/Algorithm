import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        
        List<Integer> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(i);
        }

        List<Integer> priorityQueue = new LinkedList<>();
        for (int priority : priorities) {
            priorityQueue.add(priority);
        }

        Collections.sort(priorityQueue, Collections.reverseOrder());

        int count = 0;
        while (!queue.isEmpty()) {
            int currentLocation = queue.remove(0);
            int currentPriority = priorities[currentLocation];

            if (currentPriority == priorityQueue.get(0)) {
                priorityQueue.remove(0);
                count++;
                if (currentLocation == location) {
                    return count;
                }
            } else {
                queue.add(currentLocation);
            }
        }

        return count;
    }
}