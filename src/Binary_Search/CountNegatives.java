package Binary_Search;

public class CountNegatives {
    public static int countNegatives(int[][] grid) {
        int count = 0;

        for(int row = 0, end = grid[row].length - 1; row < grid.length; row++){
            int start = 0;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(grid[row][mid] < 0){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            count += (grid[row].length - start);
        }
        return count;
    }
}
