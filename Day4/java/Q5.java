import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {11,11,23,8,25,23,1,5,10,8};

        Arrays.sort(arr);

        int n = arr.length;
        int uniqueCount = 1; 
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) { 
                arr[uniqueCount] = arr[i]; 
                uniqueCount++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
