public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
    }

    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int sum1 = 0;
        int sum2 = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] cache1 = new int[nums1.length];
        int[] cache2 = new int[nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i; j < nums1.length; j++) {
                if (i == j) {
                    cache1[j] = nums1[i];
                    cache2[j] = nums2[i];
                } else {
                    cache1[j] = nums1[j] + cache1[j - 1];
                    cache2[j] = nums2[j] + cache2[j - 1];
                }
                max = Math.max(max, cache1[j] - cache2[j]);
                min = Math.min(min, cache1[j] - cache2[j]);
                if (i == 0 && j == nums1.length - 1) {
                    sum1 = cache1[j];
                    sum2 = cache2[j];
                }
            }
        }
        int result = Math.max(sum1, sum2);
        result = Math.max(result, sum1 - min);
        result = Math.max(result, sum2 + max);
        return result;
    }
}
