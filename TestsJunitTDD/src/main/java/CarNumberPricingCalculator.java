public class CarNumberPricingCalculator {

    public int calculatePrice(String number) {
        if (number == null || ){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        int numberPrice = 0;
        String[] splitNumber = number.split("");
        String numberLetters = splitNumber[0] + splitNumber[1] + splitNumber[2];

        if ((splitNumber[1].equals(splitNumber[2]) && splitNumber[4].equals(splitNumber[5]))) {
            numberPrice = 5000;
        } else if (numberLetters.equals("GOD") ||
                numberLetters.equals("KLR") || numberLetters.equals("BOS")) {
            if (splitNumber[3].equals(splitNumber[4])) {
                numberPrice = 7000;
            } else {
                numberPrice = 2000;
            }
        } else if (splitNumber[0].equals(splitNumber[1]) &&
                splitNumber[1].equals(splitNumber[2])) {
            numberPrice = 1000;
        } else if (splitNumber[3].equals(splitNumber[4]) &&
                splitNumber[4].equals(splitNumber[5])) {
            numberPrice = 1000;
        } else {
            numberPrice = 10000;
        }
        return numberPrice;
    }

}
