package Binary_Search;

import java.util.Collections;
import java.util.List;

public class ReachNumber {
    public static void main(String[] args) {

    }

    public static int reachNumber(int target) {
        target = Math.abs(target);
        int start = 0;
        int sum = 0;

        while((sum - target) < 0 || (sum - target) % 2 != 0){
            start++;
            sum += start;
        }

        return start;
    }

}
