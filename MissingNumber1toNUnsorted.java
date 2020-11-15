class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int x1 = 1, x2 = array[0];
        for(int i = 2; i <= n;i++){
            x1 ^= i;
        }
        for(int i = 1; i < n - 1;i++){
            x2 ^= array[i];
        }
        
        return x1 ^ x2;
    }
}
