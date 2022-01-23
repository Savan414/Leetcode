package Binary_Search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

//https://leetcode.com/problems/fair-candy-swap/
public class FairCandySwap {
    public static void main(String[] args) {

    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] result = new int[2];
        int aliceTotal = 0;
        int bobTotal = 0;

        for (int x : aliceSizes) {
            aliceTotal += x;
        }

        for (int y : bobSizes) {
            bobTotal += y;
        }

        Arrays.sort(bobSizes);

        for (int i = 0; i < aliceSizes.length; i++) {

            int target = aliceSizes[i] + (bobTotal - aliceTotal) / 2;

            int start = 0;
            int end = bobSizes.length - 1;

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (bobSizes[mid] == target) {
                    return new int[]{aliceSizes[i], bobSizes[mid]};
                } else if (bobSizes[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static int[] fairCandySwapHashSet(int[] A, int[] B) {
        int dif = (IntStream.of(A).sum() - IntStream.of(B).sum()) / 2;
        HashSet<Integer> S = new HashSet<>();
        for (int a : A) S.add(a);
        for (int b : B) if (S.contains(b + dif)) return new int[] {b + dif, b};
        return new int[0];
    }
}
