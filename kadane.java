class Kadane{
    
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int rs = 0, max = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            if(rs < 0 && arr[i] > rs){
                rs = arr[i];
            }
            else{
                rs += arr[i];
            }
            
            if(rs > max)
                max = rs;
            
        }
        return max;
    }
    
}
