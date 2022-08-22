package JavaInterviewQuestions.src;

import java.util.Arrays;

public class FindFirstTwoMaxNumberInArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 56, 57, 5, 8};

        getTwoMaxValues(arr);

    }

    public static void getTwoMaxValues(int[] nums) {

        Arrays.sort(nums);
        System.out.println("Max 1- " + (nums[nums.length - 1]));
        System.out.println("Max 2- " + (nums[nums.length - 2]));
    }

}
