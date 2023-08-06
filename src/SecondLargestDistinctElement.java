import java.util.Arrays;

public class SecondLargestDistinctElement {
    int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr); // Efficient approach(by default : Ascending Order) the Linear sorting we have written below:

        // Linear sorting : Ascending Order sorting
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             swap(arr,j);
        //         }// System.out.println(Arrays.toString(arr));
        //     }
        // }
        // System.out.println(Arrays.toString(arr));

        // Linear sorting : Descending Order sorting
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(arr[j]<arr[j+1]){
        //             swap(arr,j);
        //         }// System.out.println(Arrays.toString(arr));
        //     }
        // }
        // System.out.println(Arrays.toString(arr));

        // Searching for second largest distinct Element in Ascending sorted array.
        for (int k = n - 1; k >= 1; k--) {
            if (arr[k] != arr[k - 1]) {
                return arr[k - 1];
            }
        }
        return -1;

    }

    public static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
}
