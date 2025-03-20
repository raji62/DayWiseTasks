import java.util.*;

public class AngryBirds {
    public static boolean canPlaceBirds(int[] nests, int B, int minDist) {
        int count = 1;
        int lastPlaced = nests[0];

        for (int i = 1; i < nests.length; i++) {
            if (nests[i] - lastPlaced >= minDist) {
                count++;
                lastPlaced = nests[i]; 
                if (count == B) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int largestMinimumDistance(int[] nests, int B) {
        Arrays.sort(nests); // Step 1: Sort the nests

        int low = 1;  // Minimum possible distance
        int high = nests[nests.length - 1] - nests[0]; // Maximum possible distance
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canPlaceBirds(nests, B, mid)) {
                ans = mid;  // Store the valid answer
                low = mid + 1;  // Try to find a larger minimum distance
            } else {
                high = mid - 1;  // Reduce search space
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] nests = new int[N];

        for (int i = 0; i < N; i++) {
            nests[i] = sc.nextInt();
        }

        int B = sc.nextInt();
        System.out.println(largestMinimumDistance(nests, B));
    }
}
