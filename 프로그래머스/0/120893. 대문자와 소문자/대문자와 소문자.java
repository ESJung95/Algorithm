class Solution {
    public String solution(String my_string) {
        
        StringBuilder sb = new StringBuilder();
        String[] temp = new String[my_string.length()];
        int index = 0;
        for (String item : my_string.split("")) {
            temp[index] = item;
            index++;
        }
        
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].matches("^[a-z]*$")) {
                sb.append(temp[i].toUpperCase());
            } else if (temp[i].matches("^[A-Z]*$")) {
                sb.append(temp[i].toLowerCase());
            }
        }
        
        return sb.toString();
    }
}