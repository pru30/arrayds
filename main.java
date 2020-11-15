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
