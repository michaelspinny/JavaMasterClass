public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        // validations for number input
        int originalNumber = number;
        int sum = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        }
        // while loop for calculation first digit

        int firstDigit = number;
        while (number >= 10) {
            number = number / 10;
            firstDigit = number;
        //    System.out.println("First digit = " + firstDigit);
        }

        // while loop for calculation last digit
        int lastDigit = 0;
        while (originalNumber > 0) {
            originalNumber = originalNumber % 10;
            lastDigit = originalNumber;
        //    System.out.println("Last digit = " + lastDigit);
            break;
        }
        // First & last digits calculation
        sum = firstDigit + lastDigit;
        System.out.println("Sum of two digits is " + sum);
        return sum;
    }
}
