public class TwiceAsLarge {
    public static void main(String[] args) {
        TwiceAsLarge tal = new TwiceAsLarge();
        tal.go();
    }

    public void go() {
        int[] nums = {3, 6, 1, 0};
        int[] nums2 = {0, 0, 2, 3};

        dominantIndex(nums);
        dominantIndex(nums2);
    }

    public int dominantIndex(int[] nums) {
        int largestValue = 0;
        int largestIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largestValue) {
                largestValue = nums[i];
                largestIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == largestIndex) {
                continue;
            } else if ((nums[i] * 2) > largestValue) {
                System.out.println("Largest value is not twice as large as all others");
                return -1;
            }
        }
        System.out.println("Largest value, " + largestValue + ", is at index " + largestIndex);
        return largestIndex;
    }
}