package Binary_Search;

public class NextGreatestLetter {

    public static char nextGreatestLetter(char[] letters, char target) {


            int low = 0;
            int high = letters.length - 1;

            while(low <= high){
                int mid = ((low + high)/2);

                if(target < letters[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            return letters[low % letters.length];
        }
}
