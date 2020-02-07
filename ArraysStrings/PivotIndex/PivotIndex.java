public class PivotIndex {
    public static void main(String[] args) {
        PivotIndex pi = new PivotIndex();
        pi.go();
    }

    public void go() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {-1, -1, -1, 0, 1, 1};

        findPivot(nums);
        findPivot(nums2);
        findPivot(nums3);
    }

    public int findPivot(int[] nums) {
        int totalA;
        int totalB;

        for (int index = 0; index < nums.length; index++) {
            totalA = 0;
            totalB = 0;
            for (int i = 0; i < index; i++) {
                totalA += nums[i];
            }
            for (int j = index + 1; j < nums.length; j++) {
                totalB += nums[j];
            }
            if (totalA == totalB) {
                System.out.println("Pivot = " + index);
                return index;
            }
        }
        System.out.println("No pivot found");
        return -1;
    }
}