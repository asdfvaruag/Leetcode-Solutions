public class Build_Array_from_Permutation1920 {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] num = { 0, 2, 1, 5, 3, 4 };
        Build_Array_from_Permutation1920 obj = new Build_Array_from_Permutation1920();
        int[] ans = obj.buildArray(num);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + ",");
        }
    }
}
