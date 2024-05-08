import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 여분있는 학생
        ArrayList<Integer> reserveList = new ArrayList<>();
        for (int item : reserve) {
            reserveList.add(item);
        }

        // 잃어버린 학생
        ArrayList<Integer> lostList = new ArrayList<>();
        for (int item : lost) {
            lostList.add(item);
        }

        Collections.sort(lostList);
        Collections.sort(reserveList);

        // 여분의 체육복을 가진 학생이 도난당한 경우 처리
        for (int i = 0; i < lostList.size(); i++) {
            int lostStudent = lostList.get(i);
            if (reserveList.contains(lostStudent)) {
                lostList.remove(i);
                reserveList.remove(Integer.valueOf(lostStudent));
                i--;
            }
        }

        // 체육복을 빌려줄 수 있는 학생 찾기
        for (int i = 0; i < lostList.size(); i++) {
            int lostStudent = lostList.get(i);
            int front = lostStudent - 1;
            int back = lostStudent + 1;

            if (reserveList.contains(front)) {
                reserveList.remove(Integer.valueOf(front));
                lostList.remove(i);
                i--;
            } else if (reserveList.contains(back)) {
                reserveList.remove(Integer.valueOf(back));
                lostList.remove(i);
                i--;
            }
        }

        // 체육복을 가진 학생 수 계산
        int count = n - lostList.size();

        return count;
    }
}