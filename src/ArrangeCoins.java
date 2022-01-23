public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));
    }

    public static int arrangeCoins(int n) {

        //binary search
        long lo = 1;
        long hi = n;

        while(lo <= hi){
            long mid = (int) (lo + (hi - lo)/2);

            long total = mid * (mid + 1)/2;

            if(total == n){
                return (int)mid;
            }
            else if(total > n){
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return (int)hi;
    }
}
