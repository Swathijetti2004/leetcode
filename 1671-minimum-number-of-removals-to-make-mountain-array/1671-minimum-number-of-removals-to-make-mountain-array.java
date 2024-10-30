class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0;

        // Step 1: Create arrays for increasing and decreasing lengths
        int[] left = new int[n]; // Lengths of increasing subsequences
        int[] right = new int[n]; // Lengths of decreasing subsequences

        // Step 2: Fill the left array
        for (int i = 0; i < n; i++) {
            left[i] = 1; // Each element is a subsequence of length 1
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    left[i] = Math.max(left[i], left[j] + 1);
                }
            }
        }

        // Step 3: Fill the right array
        for (int i = n - 1; i >= 0; i--) {
            right[i] = 1; // Each element is a subsequence of length 1
            for (int j = n - 1; j > i; j--) {
                if (nums[j] < nums[i]) {
                    right[i] = Math.max(right[i], right[j] + 1);
                }
            }
        }

        // Step 4: Find the maximum length of mountain
        int maxMountainLength = 0;
        for (int i = 1; i < n - 1; i++) {
            if (left[i] > 1 && right[i] > 1) { // valid peak
                maxMountainLength = Math.max(maxMountainLength, left[i] + right[i] - 1); // -1 for double counting the peak
            }
        }

        // Step 5: Calculate the minimum removals
        return n - maxMountainLength;
    }
}
