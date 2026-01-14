package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //1 sorting (bubble sort)
        for (int i = 0; i < nums.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        //searching for quadruplets
        List<List<Integer>> result = new ArrayList<>();
        long tgt = target;

        for(int i=0; i<nums.length-3; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j=i+1; j<nums.length-2; j++) {
                if (j > i+1 && nums[j] == nums[j - 1]) continue;
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long sum = 0L + nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < tgt) {
                        left++;
                    } else if (sum > tgt) {
                        right--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    }
                }
            }
        }
        return result;
    }
}
