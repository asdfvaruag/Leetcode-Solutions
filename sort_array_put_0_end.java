public class sort_array_put_0_end {
    public static void main(String[] args) {
        int[] a = { 0, 1, 0, 3, 12 };
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (a[j] != 0) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ",");
        }
    }

}
