import java.util.*;
public class PrimeMagic{
    private static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
//sieve of Eratosthenes
private static List<Integer> generatePrimes(int n){
    boolean[] isPrime=new boolean[n+1];
    Arrays.fill(isPrime,true);
    isPrime[0]=isPrime[1]=false;
     for (int i=2; i*i<= n; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j<= n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer>primes=new ArrayList<>();
        for(int i=2;i<=n;i++){
        if(isPrime[i]){
            primes.add(i);
        }
    }
    return primes;
}
public static int countPMns(int n){
    List<Integer>primes=generatePrimes(n);
    int count=0;
    int sum=0;
    for(int p:primes){
        sum+=p;
        if(sum>n) break;
        if(sum>3 && isPrime(sum)){
            count++;
        }
    }
    return count;
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int res=countPMns(n);
    System.out.println(res);
}
}