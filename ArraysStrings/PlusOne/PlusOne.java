public class PlusOne {
    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        po.go();
    }

    public void go() {
        int[] digits = {1, 2, 4};
        int[] digits2 = {9, 9, 9};
        int[] digits3 = {1, 9, 9};

        plusOne(digits);
        plusOne(digits2);
        plusOne(digits3);
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
        }
        
        if (digits[0] == 0) {
            int[] overflowDigits = new int[digits.length + 1];
            overflowDigits[0] = 1;
            return overflowDigits;
        }
        return digits;
    }
}