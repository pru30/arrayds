class Solution {
    int countTriplet(int arr[], int n) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j || (arr[i] == 0 || arr[j] == 0)){
                    continue;
                }
                if(set.contains(arr[i]+arr[j])){
                    count++;
                }
            }
        }
        
        return count/2;
    }
}
