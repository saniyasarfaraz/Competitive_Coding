//Link:https://leetcode.com/problems/reverse-integer/submissions/2007085183/
class Solution {
    public int reverse(int x) {
        
        long rev=0;
        while(x!=0){
            if(rev*10>Integer.MAX_VALUE|| rev*10<Integer.MIN_VALUE){
            return 0;
        }
            rev=rev*10+x%10;
            x=x/10;
        }
    return (int)rev;























    //     int num=0;
    //     while(x!=0){
    //         int digit=x%10;
    //         if (num > Integer.MAX_VALUE/10||num<Integer.MIN_VALUE/10) {
    //             return 0;
    //         }
    //         x=x/10;
    //         num=num*10+digit;
    //     }
    // return num;
    }
}
