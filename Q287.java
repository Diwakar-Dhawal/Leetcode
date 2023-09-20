import java.util.HashSet;

public class Q287 {
    public static void main(String[] args) {
        int [] nums = {1,2,4,6,2,3};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
                return nums[i];
            else
                set.add(nums[i]);
        }
        return 0;
        
    }
}
