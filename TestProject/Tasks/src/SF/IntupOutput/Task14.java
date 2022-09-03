package SF.IntupOutput;


import java.util.Arrays;

public class Task14 {


    public static void main(String[] args) {
        int nums[] = new int[]{2,3,4,5};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] % 2 == 0) {
                    if (nums[j] % 2 != 0) {
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}