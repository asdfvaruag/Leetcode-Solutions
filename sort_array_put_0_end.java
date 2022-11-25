public class sort_array_put_0_end {
    public static int[] pushthezeroestoend2(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 0, 3, 0, 12 };
        int[] b = pushthezeroestoend2(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }

}
