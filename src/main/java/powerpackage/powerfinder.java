package powerpackage;

public class FindPower {
    public static int calculatePower(int base, int exponent) {
        int ans = 1;
        for (int i = 0; i<exponent; i++) {
            ans *= base;
        }
        return ans;
    }
}
