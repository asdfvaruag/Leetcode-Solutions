import java.util.Arrays;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        // !Time Complexitiy is O(n^2)
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums.length; j++) {
        // if (nums[i] + nums[j] == target && i != j) {
        // return new int[] { i, j };

        // }
        // }
        // }
        // return new int[] { target };


        //TODO: With HashMap
        // int n=nums.length;
        // Map<Integer,Integer> map=new HashMap<>();
        // int[] result=new int[2];
        // for(int i=0;i<n;i++){
        //     if(map.containsKey(target-nums[i])){
        //         result[1]=i;
        //         result[0]=map.get(target-nums[i]);
        //         return result;
        //     }
        //     map.put(nums[i],i);
        // }
        // return result;


        
        //?Why not working with complement
        int i;
        int j;
        for (i = 0, j = nums.length - 1; i < nums.length && nums[j] <= target; i++, j--) {
            if (target - nums[i] == nums[j] && i != j) {
                return new int[] { i, j };
            }

        }
        return new int[] { i, j };
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        Two_Sum ob = new Two_Sum();
        System.out.println(Arrays.toString(ob.twoSum(arr, 9)));
    }
}
