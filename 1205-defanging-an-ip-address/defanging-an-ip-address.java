class Solution {
    public String defangIPaddr(String str) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '.') {
                sb.append("[.]");
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}