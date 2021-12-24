public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        // hasSameLastDigit method validation
        if ((firstNumber < 10 || firstNumber > 1000) || (secondNumber < 10 || secondNumber > 1000) || (thirdNumber < 10 || thirdNumber > 1000)) {
            return false;
        }
        // declaration of variables

        int lastDigitFirstNumber = 0;
        int lastDigitSecondNumber = 0;
        int lastDigitThirdNumber = 0;
        // removing last digit from a numbers and assigning values

        lastDigitFirstNumber = firstNumber % 10;
        lastDigitSecondNumber = secondNumber % 10;
        lastDigitThirdNumber = thirdNumber % 10;
        // last digit values comparison
        if ((lastDigitFirstNumber == lastDigitSecondNumber) || (lastDigitFirstNumber == lastDigitThirdNumber) || (lastDigitSecondNumber == lastDigitThirdNumber)) {
            return true;
        }
        return false;
    }

    // isValid method declaration
    public static boolean isValid(int myNumberValue) {
        if (myNumberValue >= 10 && myNumberValue <= 1000) {
            return true;
        }
        return false;
    }
}
