package Binary_Search;

public class SearchRange {
    public static void main(String[] args) {
        int[] input = new int[]{5, 7,7, 8, 8, 10};
        int[] result = searchRange(input, 6);
        System.out.println(result[0] + ", " + result[1]);
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];
        result[0] = firstIndex(nums, target);
        result[1] = lastIndex(nums, target);

        return result;
    }

    public static int firstIndex(int[] nums, int target){

        int firstIndex = -1;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(nums[mid] >= target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }

            if(nums[mid] == target) firstIndex = mid;
        }
        return firstIndex;
    }

    public static int lastIndex(int[] nums, int target){


        int lastIndex = -1;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(nums[mid] <= target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }

            if(nums[mid] == target) lastIndex = mid;
        }
        return lastIndex;
    }
}
