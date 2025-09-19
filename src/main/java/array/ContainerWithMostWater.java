package array;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int volume = 0, maxVolume = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = height[left] > height[right] ? height[right] : height[left];
            volume = width * (right - left);
            if (maxVolume < volume) {
                maxVolume = volume;
            }

            while(left < right && height[left] <= width) left++;
            while(left < right && height[right] <= width) right--;
        }
        return maxVolume;

    }
}
