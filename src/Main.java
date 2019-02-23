import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] females =
                Arrays.asList("2 3 4 6 7 8 8 8 9 11 11 14 18 18 21 23 24 24 24 25 26 30 30 30 30 31 32 32 33 33 35 36 37 40 40 40 40 42 42 43 44 44 44 45 45 45 47 47 49 50 53 53 53 54 55 56 56 56 57 57 58 58 60 62 62 63 63 63 64 66 67 70 71 71 72 73 76 77 80 80 81 82 83 83 84 85 87 90 91 91 91 92 93 94 94 97 98 98 99 99"
                        .split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        int[] males =
                Arrays.asList("85 78 34 89 85 48 27 5 75 70 75 90 3 65 74 91 82 47 75 27 26 73 88 26 22 37 67 67 20 48 67 4 77 52 93 13 99 71 17 26 92 92 15 95 8 40 37 89 86 63 15 64 35 3 41 56 91 60 23 10 59 41 66 35 93 10 99 91 80 68 16 24 11 82 70 18 21 58 7 59 20 21 22 54 75 14 62 18 73 36 79 31 76 96 17 20 5 16 63 37"
                        .split(" ")).stream().mapToInt(Integer::parseInt).toArray();

        thePlayboyChimp(females, males);
    }

    public static void thePlayboyChimp(int[] females, int[] males) {
        for (int i = 0; i < males.length; i++) {
            int maleHeight = males[i],
                query = binarySearch(females, 0, females.length, maleHeight),
                tallestShorterIdx = getShortestNeighbour(females, query, maleHeight),
                shortestTallerIdx = getTallesttNeighbour(females, query, maleHeight);

            System.out.println(
                    (tallestShorterIdx >= 0 ? females[tallestShorterIdx] : "X")
                            + " " +
                            (shortestTallerIdx >= 0 ? females[shortestTallerIdx] : "X")
            );
        }
    }

    public static int getShortestNeighbour(int[] females, int femaleIdx, int currentMaleHeight) {
        if (femaleIdx - 1 >= 0) {
            for (int i = femaleIdx; i >= 0; i--) {
                if (females[i] < currentMaleHeight) return i;
            }
        }
        return -1;
    }

    public static int getTallesttNeighbour(int[] females, int femaleIdx, int currentMaleHeight) {
        if (femaleIdx + 1 < females.length) {
            for (int i = femaleIdx; i < females.length; i++) {
                if (females[i] > currentMaleHeight) return i;
            }
        }
        return -1;
    }

    static int binarySearch(int arr[], int l, int r, int x) {
        int mid = l + (r - l) / 2;
        if (r >= l) {
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        return mid;
    }
}
