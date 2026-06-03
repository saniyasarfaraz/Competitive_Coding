//link: https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1
class Solution {
    void segregate0and1(int[] arr) {
        // code here
        //Arrays.sort(arr);//Interviwer may kill you if u do this
        //normal sorting
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]>arr[j]){
        //             int temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        
        //2 pointer
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }else if(arr[j]==1){
                j--;
            }
            else{
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
                i++;
            }
        }
        
    }
}
