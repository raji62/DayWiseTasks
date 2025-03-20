import java.util.*;
public class BusyBee {
    public static void findPoints(int n,int[] arr,int k){
        List<String>result=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                double average=(arr[i]+arr[j])/2.0;
                if(average>=k){
                result.add("(" + arr[i]+ ", " + arr[j]+ ")");
            }   
        }
    }
    for(String pair: result){
        System.out.println(pair+" ");
    }
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        findPoints(n,arr,k);
    }
}
