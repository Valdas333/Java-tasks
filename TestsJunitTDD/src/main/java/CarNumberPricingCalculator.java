import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarNumberPricingCalculator {

    private boolean hasThreeNumbers(String input) {
        Pattern pattern = Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    private boolean hasThreeChars(String input) {
        Pattern pattern = Pattern.compile("[A-Z]{3,6}");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    private boolean correctPlateNumber(String input){
        return hasThreeChars(input) && hasThreeChars(input);
    }

    public int calculatePrice(String number) {
        if (number == null || number.length() > 6 || number.isEmpty() || correctPlateNumber(number)){
            throw new IllegalArgumentException("Incorrect plate number format. " +
                    "Must be 1-6 symbols latin letters and number combination");
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
