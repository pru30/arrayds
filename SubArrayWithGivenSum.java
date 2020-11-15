import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    GFG gfg = new GFG();
	    while(T > 0){
	        int N = sc.nextInt();
	        int S = sc.nextInt();
	        
	        int arr[] = new int[N];
	        //array input
	        for(int i = 0; i < N; i++){
	            arr[i] = sc.nextInt();
	        }
	        gfg.subArrayWithSum(arr, N, S);
	        T--;
	    }
	    
	 }
	 void subArrayWithSum(int arr[], int N, int S){
	       int i = 0, j = 0, rs = 0;
	       while(j < N){
	           rs += arr[j++];
    	       while(i < j && rs > S){
    	           rs -= arr[i++];
    	       }
    	       
    	       if(rs == S){
    	           System.out.println((i + 1) + " " + j);
    	           return;
    	       }
    	   
	       }
	       System.out.println(-1);
	 }
}
