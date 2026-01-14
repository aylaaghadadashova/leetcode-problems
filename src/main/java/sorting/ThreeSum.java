package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        //1 sorting (bubble sort)
        for(int i=0; i<nums.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<nums.length-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                swapped = true;
            }
            if(!swapped) break;
        }

        //searching for triplets
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i+1;
            int right = nums.length-1;
            int sum = 0-nums[i];

            while(left < right){
                if(nums[left] + nums[right] < sum) {
                    left++;
                } else if(nums[left] + nums[right] > sum) {
                    right--;
                } else {
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
            }
        }
        return result;
    }
}
