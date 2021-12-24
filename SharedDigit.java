public class ShareDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        // method input verification
        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }
        // method variable declaration
        int lastDigitFirstNumber = 0;
        int lastDigitSecondNumber = 0;
        int firstDigitFirstNumber = 0;
        int firstDigitSecondNumber = 0;

        lastDigitFirstNumber = firstNumber % 10;
        firstDigitFirstNumber = firstNumber / 10;

        lastDigitSecondNumber = secondNumber % 10;
        firstDigitSecondNumber = secondNumber / 10;

        // comparison logic
        if (lastDigitFirstNumber == lastDigitSecondNumber || lastDigitFirstNumber == firstDigitSecondNumber || lastDigitSecondNumber == firstDigitFirstNumber || firstDigitSecondNumber == firstDigitFirstNumber) {
            return true;
        } else return false;
    }
}
