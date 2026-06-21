//Link:https://leetcode.com/problems/find-the-highest-altitude/?envType=daily-question&envId=2026-06-19
class Solution {
    public int largestAltitude(int[] gain) {
        int max= 0;
        int curr= 0;
        for(int i=0;i<gain.length;i++){
            
            curr=curr+gain[i];
            max=Math.max(max,curr);
        }
        return max;
    }
}
