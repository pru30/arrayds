 int MissingNumber(int array[], int n) {
        // Your Code Here
        int low = 0, high = n - 2, mid = 0;
        
        while(low <= high){
            if(low == high){
                if(array[low] > low + 1)
                    return array[low] - 1;
                return array[low] + 1;
            }
            
            mid = low + (high-low)/2;
            
            if(array[mid] > mid + 1){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        
        return -1;
    }
