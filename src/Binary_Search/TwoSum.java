package Binary_Search;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] input = {1, 3, 4, 6, 8, 9, 10};
        int[] result = twoSum(input, 12);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {

        int[] indice = new int[2];
        if(numbers == null || numbers.length < 2 ){
            return new int[2];
        }

        int start = 0;
        int end = numbers.length - 1;

        while(start < end){
            if(numbers[start] == target - numbers[end]){
                return new int[]{start + 1, end + 1};
            }
            else if(numbers[start] > target - numbers[end]){
                // move end backward to the last value that numbers[end] <= target - numbers[start]
               end = largestSmallerThanTarget(numbers, start, end , target - numbers[start]);

            }
            else {
                // move start forward to the first value that numbers[start] >= target - numbers[end]
                start = smallestLargerThanTarget(numbers, start, end, target - numbers[end]);
            }
        }
        return new int[2];
    }

    private static int largestSmallerThanTarget(int[] numbers, int start, int end, int target) {
        while(start <= end){
            int mid = start + (end - start)/2;

            if(numbers[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }

    private static int smallestLargerThanTarget(int[] numbers, int start, int end, int target) {
        while(start <= end){
            int mid = start + (end - start)/2;

            if(numbers[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }


}
