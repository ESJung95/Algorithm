import java.util.*;

class Solution {
    public long solution(String expression) {
        return Math.max(calculate(expression, "+-*"),
                        Math.max(calculate(expression, "+*-"),
                                 Math.max(calculate(expression, "-+*"),
                                          Math.max(calculate(expression, "-*+"),
                                                   Math.max(calculate(expression, "*+-"),
                                                            calculate(expression, "*-+"))))));
    }
    
    private long calculate(String expression, String operators) {
        StringTokenizer st = new StringTokenizer(expression, "+-*", true);
        List<Long> operands = new ArrayList<>();
        List<Character> operatorList = new ArrayList<>();
        
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if ("+-*".contains(token)) {
                operatorList.add(token.charAt(0));
            } else {
                operands.add(Long.parseLong(token));
            }
        }
        
        for (char operator : operators.toCharArray()) {
            for (int i = 0; i < operatorList.size(); ) {
                if (operatorList.get(i) == operator) {
                    long result = calculate(operands.get(i), operands.get(i + 1), operator);
                    operands.remove(i);
                    operands.remove(i);
                    operatorList.remove(i);
                    operands.add(i, result);
                } else {
                    i++;
                }
            }
        }
        
        return Math.abs(operands.get(0));
    }
    
    private long calculate(long operand1, long operand2, char operator) {
        if (operator == '+') {
            return operand1 + operand2;
        } else if (operator == '-') {
            return operand1 - operand2;
        } else {
            return operand1 * operand2;
        }
    }
}
