import java.util.*;

class Solution {
    public long solution(String expression) {
        // 연산자들의 우선순위 조합 생성
        List<List<Character>> operatorOrders = generateOperatorOrders();
        
        // 주어진 수식을 피연산자와 연산자로 분리
        List<Long> operands = new ArrayList<>();
        List<Character> operators = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(expression, "+-*", true);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if ("+-*".contains(token)) {
                operators.add(token.charAt(0));
            } else {
                operands.add(Long.parseLong(token));
            }
        }
        
        long maxResult = 0;
        
        // 모든 우선순위 조합에 대해 계산
        for (List<Character> operatorOrder : operatorOrders) {
            List<Long> tempOperands = new ArrayList<>(operands);
            List<Character> tempOperators = new ArrayList<>(operators);
            
            for (char operator : operatorOrder) {
                for (int i = 0; i < tempOperators.size(); i++) {
                    if (tempOperators.get(i) == operator) {
                        long result = calculate(tempOperands.get(i), tempOperands.get(i + 1), operator);
                        tempOperands.remove(i);
                        tempOperands.remove(i);
                        tempOperands.add(i, result);
                        tempOperators.remove(i);
                        i--;
                    }
                }
            }
            
            maxResult = Math.max(maxResult, Math.abs(tempOperands.get(0)));
        }
        
        return maxResult;
    }
    
    // 연산자의 우선순위 조합 생성
    private List<List<Character>> generateOperatorOrders() {
        List<List<Character>> orders = new ArrayList<>();
        orders.add(Arrays.asList('+', '-', '*'));
        orders.add(Arrays.asList('+', '*', '-'));
        orders.add(Arrays.asList('-', '+', '*'));
        orders.add(Arrays.asList('-', '*', '+'));
        orders.add(Arrays.asList('*', '+', '-'));
        orders.add(Arrays.asList('*', '-', '+'));
        return orders;
    }
    
    // 연산 수행
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
