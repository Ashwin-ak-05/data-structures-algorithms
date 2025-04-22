package org.example.neetcode150.binarySearch;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = findMax(piles);

        int min_speed = r;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (canEat(piles, h, m)) {
                min_speed = Integer.min(min_speed, m);
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return min_speed;
    }

    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Integer.max(max, arr[i]);
        }
        return max;
    }

    public boolean canEat(int[] piles, int h, int k) {
        int hoursNeeded = 0;
        for (int pile : piles) {
            hoursNeeded += (pile + k - 1) / k; // Equivalent to ceil(pile / k)
            if (hoursNeeded > h) return false;
        }
        return hoursNeeded <= h;
    }
}

/**
 * Key Idea: Ceiling Division Without Math.ceil()
 * Normally, we'd calculate:
 * <p>
 * hours
 * =
 * ceil
 * (
 * pile
 * 𝑘
 * )
 * hours=ceil(
 * k
 * pile
 * ​
 * )
 * However, since pile and k are integers, direct division (pile / k) would perform floor division (rounding down).
 * <p>
 * To simulate ceil(pile / k), we use:
 * <p>
 * (
 * pile
 * +
 * 𝑘
 * −
 * 1
 * 𝑘
 * )
 * (
 * k
 * pile+k−1
 * ​
 * )
 * This formula ensures that any remainder pushes the division up to the next integer, effectively mimicking ceil().
 * <p>
 * Example Calculations
 * pile	k	Expected ceil(pile/k)	(pile + k - 1) / k
 * 10	3	ceil(10/3) = 4	(10 + 3 - 1) / 3 = 4
 * 7	4	ceil(7/4) = 2	(7 + 4 - 1) / 4 = 2
 * 8	2	ceil(8/2) = 4	(8 + 2 - 1) / 2 = 4
 */
