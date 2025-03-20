import java.lang.Math;
import java.util.Scanner;
public class ParkingLot {
    public static int maxCount(String arr){
        int maxCount1=0,currCount=0;
        for(char c:arr.toCharArray()){
            if(c=='S'){
                currCount++;
                maxCount1=Math.max(maxCount1,currCount);
            }
            else{
                currCount=0;
            }
        }
        return maxCount1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String arr=sc.nextLine();
        int res=maxCount(arr);
        System.out.println(res);
    }
}
