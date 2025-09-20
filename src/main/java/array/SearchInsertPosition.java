package array;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        while(nums[i] < target){
            i++;
            if(i == nums.length) return i;
        }

        return i;
    }
}
