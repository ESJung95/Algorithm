import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty()) {
                list.add(arr[i]);
            } else {
                if (arr[i] > list.get(list.size() - 1)) {
                    list.add(arr[i]);
                } else {
                    while (!list.isEmpty() && arr[i] <= list.get(list.size() - 1)) {
                        list.remove(list.size() - 1);
                    }
                    list.add(arr[i]);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int j = 0; j < result.length; j++) {
            result[j] = list.get(j);
        }

        return result;
    }
}