//Link: https://leetcode.com/problems/add-binary/

//import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        // BigInteger n = new BigInteger(a, 2).add(new BigInteger(b, 2));
        // String result = n.toString(2);
        // return result;

      
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);  // add current bit
            carry = sum / 2;         // update carry
        }

        return result.reverse().toString();
    


    }
}
