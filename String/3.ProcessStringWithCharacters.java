//Link: https://leetcode.com/problems/process-string-with-special-operations-i/
class Solution {
    public String processStr(String s) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                sb.append(sb);
            }
            else if(s.charAt(i)=='*' && sb.length()>0){
                sb.deleteCharAt(sb.length()-1);
            
        }else if(s.charAt(i)=='%'){
            sb.reverse();
        }else if('a'<=s.charAt(i) &&s.charAt(i)<='z'){
            sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
