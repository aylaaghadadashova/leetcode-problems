package sorting;

import static java.lang.Math.abs;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
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

        if (nums.length == 3) return nums[0] + nums[1] + nums[2];

        int close = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) return sum;

                if (Math.abs((long)target - sum) < Math.abs((long)target - close)) {
                    close = sum;
                }

                if (sum < target) left++;
                else right--;
            }
        }
        return close;
    }
}
