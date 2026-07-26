class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int r = arr.length-2;
       
        while(r>=0){
            if(arr[r]>=arr[r+1]) r--;
            else break;
            
        }
        
        // System.out.println(r);
        if(r==-1) {
            reverse(arr,r+1,arr.length-1);
            return;
        }
        int min = arr[r];
        int l = arr.length-1;
        while(l>=0){
            if(arr[l]>min){
               
                arr[r] = arr[l];
                arr[l] = min;
                break;
                
            }
            l--;
        }
       
        reverse(arr,r+1,arr.length-1);
        // reverse(arr,r,r+1);
        
        
    }
    
    void reverse(int[] arr,int l,int r){
        while(l<r){
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}