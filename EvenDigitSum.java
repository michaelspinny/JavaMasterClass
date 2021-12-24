public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        // method validation for negative numbers
        if(number < 0) {
            return -1;
        }
        // method variables declaration
        int lastDigit = 0;
        int sum = 0;
        // method calculation
        while (number > 0) {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum = sum + lastDigit;
            }
            number /= 10;
        }
        return sum;
    }
}
