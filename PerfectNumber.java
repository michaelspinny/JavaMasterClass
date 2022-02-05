public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        // isPerfectNumber method validation
        if (number < 1) {
            return false;
        }
        // isPerfectNumber variables declaration
        int FactorCandidate = 1;
        int FactorSum = 0;
        // isPerfectNumber loop
        for (int i = 0; i <= number; i++) {
            if (number % FactorCandidate == 0) {
                FactorSum = FactorCandidate + FactorSum;
            }
            FactorCandidate++;
        }
       FactorSum = FactorSum - number;
        if (FactorSum == number) {
            return true;
        } else {
            return false;
        }
    }
}
