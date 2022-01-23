package Binary_Search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IntersectionOfArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int x : nums1){
            int freq = map.getOrDefault(x, 0);
            map.put(x, freq + 1);
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int y: nums2){
            if(map.containsKey(y) && map.get(y) != 0){
                list.add(y);
                map.put(y, map.get(y) - 1);
            }
        }

        int[] result = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}
