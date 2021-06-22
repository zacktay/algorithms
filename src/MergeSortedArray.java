public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int currentIndex = nums1.length - 1;
        m = n-1;
        n = n-1;

        // Start from end,
        while (m >= 0 && n >= 0) {
            // If end of nums1 > end of nums 2, place nums1[m] at the nums1[currentIndex], decrease index of m
            if (nums1[m] > nums2[n]) {
                nums1[currentIndex] = nums1[m];
                m--;
            } else {
                // place nums2[n] at nums1[currentIndex],decrease index of n
                nums1[currentIndex] = nums2[n];
                n--;
            }
            currentIndex--;
        }

        while(n >= 0){
            nums1[currentIndex] = nums2[n];
            currentIndex--;
            n--;
        }
    }
}
