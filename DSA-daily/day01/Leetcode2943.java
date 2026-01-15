import java.util.*;

class Leetcode2943 {
    public static void main(String[] args) {
        int n = 2;
        int m = 1;
        int[] hBars = {2, 3};
        int[] vBars = {2};
        int result = maximizeSquareHoleArea(n, m, hBars, vBars);
        System.out.println(result);
    }
    public static int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int maxH = getMaxGap(hBars);
        int maxV = getMaxGap(vBars);

        int side = Math.min(maxH, maxV);
        return side * side;
    }

    public static int getMaxGap(int[] bars) {
        Arrays.sort(bars);

        int maxConsecutive = 1;
        int current = 1;

        for (int i = 1; i < bars.length; i++) {
            if (bars[i] == bars[i - 1] + 1) {
                current++;
            } else {
                current = 1;
            }
            maxConsecutive = Math.max(maxConsecutive, current);
        }
        return maxConsecutive + 1;
    }
}
