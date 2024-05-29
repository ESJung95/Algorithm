import java.util.*;
import java.text.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int basicTime = fees[0];
        int basicFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        Map<String, List<String>> carRecords = new HashMap<>();
        for (String record : records) {
            String[] details = record.split(" ");
            String time = details[0];
            String carNumber = details[1];
            String action = details[2];

            carRecords.computeIfAbsent(carNumber, k -> new ArrayList<>()).add(time + " " + action);
        }

        Map<String, Integer> totalTimes = new HashMap<>();
        for (String carNumber : carRecords.keySet()) {
            List<String> times = carRecords.get(carNumber);
            int totalTime = 0;
            String inTime = null;

            for (String timeAction : times) {
                String[] ta = timeAction.split(" ");
                String time = ta[0];
                String action = ta[1];

                if (action.equals("IN")) {
                    inTime = time;
                } else if (action.equals("OUT")) {
                    totalTime += calculateMinutes(inTime, time);
                    inTime = null;
                }
            }

            if (inTime != null) {
                totalTime += calculateMinutes(inTime, "23:59");
            }

            totalTimes.put(carNumber, totalTime);
        }

        List<String> sortedCarNumbers = new ArrayList<>(totalTimes.keySet());
        Collections.sort(sortedCarNumbers);

        int[] result = new int[sortedCarNumbers.size()];
        for (int i = 0; i < sortedCarNumbers.size(); i++) {
            String carNumber = sortedCarNumbers.get(i);
            int time = totalTimes.get(carNumber);
            result[i] = calculateFee(time, basicTime, basicFee, unitTime, unitFee);
        }

        return result;
    }

    private int calculateMinutes(String inTime, String outTime) {
        String[] inParts = inTime.split(":");
        String[] outParts = outTime.split(":");
        int inMinutes = Integer.parseInt(inParts[0]) * 60 + Integer.parseInt(inParts[1]);
        int outMinutes = Integer.parseInt(outParts[0]) * 60 + Integer.parseInt(outParts[1]);
        return outMinutes - inMinutes;
    }

    private int calculateFee(int totalTime, int basicTime, int basicFee, int unitTime, int unitFee) {
        if (totalTime <= basicTime) {
            return basicFee;
        }
        int extraTime = totalTime - basicTime;
        int extraUnits = (int) Math.ceil((double) extraTime / unitTime);
        return basicFee + extraUnits * unitFee;
    }
}
