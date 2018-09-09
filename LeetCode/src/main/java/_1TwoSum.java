import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1TwoSum {

    public static void main(String[] args) {

        int[] arr = new int[] {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> twoSumMap = new HashMap<>();

        for(int i=0; i< nums.length; i++) {

            int num = nums[i];
            int pair = target - num;
            if(twoSumMap.containsKey(pair)) {
                return new int[]{twoSumMap.get(pair), i};
            }
            twoSumMap.put(num, i);
        }

        return new int[2];

    }

}
