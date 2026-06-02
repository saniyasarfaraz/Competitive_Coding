//link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //brute force
        // int a[]=new int[2];
        // for(int i=0;i<numbers.length;i++){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j]==target){
        //             a[0]= i+1;
        //            a[1]=j+1;
        //         }
        //     }
            
        // }
        // return a;
        //optimizzed
        int j=numbers.length-1;
        int i=0;
        while(i <j){
            if(numbers[i]+numbers[j]==target){
                return new int[] {i+1,j+1};
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }
            else if(numbers[i]+numbers[j]<target){
                i++;
            }
        }
        return new int[]{0};
    
           
    }

    
}
