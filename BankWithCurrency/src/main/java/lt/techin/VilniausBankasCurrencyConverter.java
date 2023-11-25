package lt.techin;

import lt.itakademija.exam.*;

public class VilniausBankasCurrencyConverter implements CurrencyConverter {

    CurrencyRatesProvider currencyRatesProvider;

    public VilniausBankasCurrencyConverter(CurrencyRatesProvider currencyRatesProvider) {
        this.currencyRatesProvider = currencyRatesProvider;
    }

    @Override
    public Money convert(Currency from, Currency to, Money amount) {
        if (currencyRatesProvider.getRate(from, to) == null) {
            throw new CurrencyConversionException("Something stupid here");
        }
        return amount.multiply(currencyRatesProvider.getRate(from, to));

    }
}



