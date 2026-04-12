package binarySearch;
class VersionControl {

    // simulate the first bad version
    int bad = 4;

    // API simulation
    public boolean isBadVersion(int version) {
        return version >= bad;
    }
}

public class FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {

        int start = 1;
        int end = n;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                end = mid;       // search left side
            } else {
                start = mid + 1; // search right side
            }
        }

        return start;
    }

    public static void main(String[] args) {

        FirstBadVersion sol = new FirstBadVersion();

        int n = 5;

        int result = sol.firstBadVersion(n);

        System.out.println("First bad version is: " + result);
    }
}