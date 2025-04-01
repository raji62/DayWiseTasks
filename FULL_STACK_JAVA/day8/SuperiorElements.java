import java.util.*;

public class SuperiorElements {
    public static List<Integer> findSuperiorElements(int[] a, int n) {
        List<Integer> result = new ArrayList<>();
        int maxFromRight = Integer.MIN_VALUE;
        
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > maxFromRight) {
                result.add(a[i]); // Add superior element
                maxFromRight = a[i]; // Update maxFromRight
            }
        }
        
        // Sorting the result before returning
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        List<Integer> superiorElements = findSuperiorElements(a, n);
        
        System.out.println("Superior Elements: " + superiorElements);
        sc.close();
    }
}
