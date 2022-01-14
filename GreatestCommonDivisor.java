public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        // getGreatestDivisor method input validation
        if (first < 10 || second < 10) {
            return -1;
        }
        // getGreatestDivisor variable initiation
        int greatestCommonDivisorCandidate = (first < second) ? first : second;
        // getGreatestDivisor method loop
        while (greatestCommonDivisorCandidate > 0) {
            // System.out.println(greatestCommonDivisorCandidate);
            if (second % greatestCommonDivisorCandidate == 0 && first % greatestCommonDivisorCandidate == 0) {
                return greatestCommonDivisorCandidate;
            } else {
                greatestCommonDivisorCandidate --;
            }
        }
        return 1;
    }
}
