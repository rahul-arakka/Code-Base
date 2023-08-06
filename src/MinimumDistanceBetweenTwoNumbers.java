public class MinimumDistanceBetweenTwoNumbers {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int distance = Integer.MAX_VALUE;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                for (int j = i + 1; j < n; j++) {
                    if (a[j] == y && (j - i) < distance) {
                        distance = j - i;
                        flag = true;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == y) {
                for (int j = i + 1; j < n; j++) {
                    if (a[j] == x && (j - i) < distance) {
                        distance = j - i;
                        flag = true;
                    }
                }
            }
        }
        if (flag == true)
            return distance;
        else return -1;
    }
}
