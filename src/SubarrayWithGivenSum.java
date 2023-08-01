import java.util.ArrayList;

public class SubarrayWithGivenSum {


    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        // List<Intt
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;
        int start = 0;
        int end = 0;
        if (s <= 0) {
            result.add(-1);
            return result;
        }
        while (start < n && end < n) {
            if (arr[start] == arr[end] && arr[end] == s) {
                result.add(start + 1);
                result.add(start + 1);
                return result;
            }
            if (s == sum + arr[end]) {
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
            if (s > sum + arr[end]) {
                sum += arr[end];
                end++;
            } else {
                sum -= arr[start];
                start++;
            }
            // System.out.println(sum);


        }
        result.add(-1);
        return result;

    }
}

