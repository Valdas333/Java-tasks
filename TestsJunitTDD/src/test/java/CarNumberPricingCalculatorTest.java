import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class CarNumberPricingCalculatorTest {

    private final CarNumberPricingCalculator carNumberPricingCalculator = new CarNumberPricingCalculator();

    @Test
    public void testAllLettersAreTheSameCost1000(){
        assertEquals(1000, carNumberPricingCalculator.calculatePrice(("AAA895")));
        assertEquals(1000, carNumberPricingCalculator.calculatePrice(("BBB975")));

    }

    @Test
    public void testAllNumbersAreTheSame1000(){
        assertEquals(1000, carNumberPricingCalculator.calculatePrice(("MRT111")));
        assertEquals(1000, carNumberPricingCalculator.calculatePrice(("TER999")));
    }

    @Test
    public void testAllNumbersAndLettersAreTheSameCost5000(){
        assertEquals(5000, carNumberPricingCalculator.calculatePrice("DDD111"));
        assertEquals(5000, carNumberPricingCalculator.calculatePrice("MMM888"));
    }

    @Test
    public void testLettersAreSpecialCost2000(){
        assertEquals(2000, carNumberPricingCalculator.calculatePrice("GOD455"));
        assertEquals(2000, carNumberPricingCalculator.calculatePrice("KLR155"));
        assertEquals(2000, carNumberPricingCalculator.calculatePrice("BOS895"));
    }

    @Test
    public void testLettersAreSpecialAndNumbersAreSameCost7000(){
        assertEquals(7000, carNumberPricingCalculator.calculatePrice("GOD555"));
        assertEquals(7000, carNumberPricingCalculator.calculatePrice("KLR111"));
        assertEquals(7000, carNumberPricingCalculator.calculatePrice("BOS333"));
    }

    @Test
    public void testNumberIsNominalTypeCost10000(){
        assertEquals(10000, carNumberPricingCalculator.calculatePrice(("FDD547")));
        assertEquals(10000, carNumberPricingCalculator.calculatePrice(("PKN621")));
    }

    @Test
    public void testExceptionThrownThenWrongNumber(){
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> carNumberPricingCalculator.calculatePrice("800FGT"));
        assertEquals("Incorrect plate number format. Must be 1-6 symbols" +
                " latin letters and number combination" );
    }


}
