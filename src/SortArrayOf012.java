import java.util.Arrays;

public class SortArrayOf012 {
    public static void sort012(int a[], int n) {
        // code here
        Arrays.sort(a);
        // Linear Search : Not the Efficient Method to sort the array.
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(a[j]>a[j+1]){
        //             swap(a,j);
        //         }
        //     }
        // }
    }
    // public static void swap(int[] a, int j){
    //     int temp = a[j];
    //     a[j] = a[j+1];
    //     a[j+1] = temp;
    // }
}
