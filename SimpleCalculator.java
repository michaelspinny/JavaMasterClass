public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
       double sumOfDoubles = firstNumber + secondNumber;
       return sumOfDoubles;
    }

    public double getSubtractionResult() {
        double subOfDoubles = firstNumber - secondNumber;
        return subOfDoubles;
    }

    public double getMultiplicationResult() {
        double multOfDoubles = firstNumber * secondNumber;
        return multOfDoubles;
    }

    public double getDivisionResult() {
        double divOfDoubles;
        if (secondNumber == 0) {
            divOfDoubles = 0;
        } else {
            divOfDoubles = firstNumber / secondNumber;
        }
        return divOfDoubles;
    }
}
