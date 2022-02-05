public class FactorPrinter {
    public static void printFactors(int number) {
        //  printFactors method input validation
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            //  printFactors variables declaration
            int factorCandidate = 1;
            // printFactors method loop
            for (int i = 0; i <= number; i++) {
                if (factorCandidate != 0 && (number % factorCandidate == 0)) {
                    System.out.println(factorCandidate);
                }
                factorCandidate++;
            }
        }
    }
}
