import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {

        int[] arr = { 900, 940, 950, 1100, 1500, 1800 };
        int[] dep = { 910, 1200, 1120, 1130, 1900, 2000 };

        System.out.println(minPlatform(arr, dep));
    }

    static int minPlatform(int arr[], int dep[]) {

        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platformsNeeded = 1;
        int maxPlatforms = 1;
        int i = 1;
        int j = 0;

        while (i < n && j < n) {

            if (arr[i] <= dep[j]) {
                platformsNeeded++;
                i++;
            } else {
                platformsNeeded--;
                j++;
            }
            maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
        }
        return maxPlatforms;
    }
}
