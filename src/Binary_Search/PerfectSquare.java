package Binary_Search;

public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(5));
    }

    public static boolean isPerfectSquare(int num) {

        if(num < 1) {
            return false;
        }

        int start = 0;
        int end = num;

        while(start <= end){
            int mid = end - ((end - start) / 2);
            if(num % mid == 0 && num / mid == mid){
                return true;
            }
            else if(num / mid > mid){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
}
}
