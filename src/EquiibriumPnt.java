public class EquiibriumPnt {
  public static int equilibriumPoint(long arr[], int n) {

            // Your code here
            long[] a2 = new long[n];
            for(int l=0;l<n;l++){
                a2[l] = arr[l];
            }
            for(int i=n-2;i>=0;i--){
                a2[i] += a2[i+1];
                // System.out.print(a2[i]+"");
            }

            for(int j=1;j<n;j++){
                arr[j] += arr[j-1];
                // System.out.print(arr[j]+"");
            }
            for(int k=0;k<n;k++){
                if(arr[k] == a2[k]){
                    return k+1;
                }
            }
            return -1;
        }
}
