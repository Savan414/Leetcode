package Binary_Search;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class VersionControl {


    public static void main(String[] args) {
        System.out.println(firstBadVersion(10));
    }

    public static int firstBadVersion(int n) {
        int first = 1;
        int last = n;

        while(first < last){

            int mid = first + (last - first)/2;

            if(isBadVersion(mid)){
                last = mid;
            }
            else {
                first = mid + 1;
            }
        }
        return last;
    }

    public static boolean isBadVersion(int version){
        return version == 7;

    }
}
