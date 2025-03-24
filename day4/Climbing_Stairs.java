import java.util.HashMap;

public class Climbing_Stairs {
	static HashMap<Integer, Long> memo = new HashMap<Integer, Long>();

   	private static long fib(int n) {
   		
		// TODO Auto-generated method stub
		if(n<=1)return n;
		
		if(memo.containsKey(n))
			return memo.get(n);
		
		long result=fib(n-1)+fib(n-2);
		memo.put(n, result);
				
		return result;
	}
	 public static void main(String[] args) {
	       
	    	int n=5;
	    	n=n+1;
	    	long res=fib(n);
	    	System.out.println(res);
	    	
	    	
	    }
}
	/*public class FibonacciTabulation {
    public static long fib(int n) {
        if (n <= 1) return n;

        long[] dp = new long[n + 1]; // Array to store Fibonacci values
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // Compute Fibonacci using previously stored values
        }
        return dp[n]; // Return the nth Fibonacci number
    }

    public static void main(String[] args) {
        int n = 10; // Compute Fibonacci of 10
        System.out.println("Fibonacci of " + n + " is: " + fib(n));
    }
}*/
