import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaxCalculatorTest {
    TaxCalculator taxCalculator = new TaxCalculator();
    @BeforeEach
    void setUp(){
        this.taxCalculator = new TaxCalculator();
    }
    @AfterEach
    void tearDown(){
        this.taxCalculator = null;
    }
    @Test
    void range1(){
        assertEquals(0,taxCalculator.calculateTaxByPurchasePrice(100000));
    }
    @Test
    void range2(){
        assertEquals(1100,taxCalculator.calculateTaxByPurchasePrice(200000));
    }
    @Test
    void range3(){
        assertEquals(4600,taxCalculator.calculateTaxByPurchasePrice(300000));
    }
    @Test
    void range4(){
        assertEquals(13350,taxCalculator.calculateTaxByPurchasePrice(400000));
    }
    @Test
    void range5(){
        assertEquals(54350,taxCalculator.calculateTaxByPurchasePrice(800000));
    }
    @Test
    void invalidInput(){
        assertThrows(IllegalArgumentException.class,() -> {
            taxCalculator.calculateTaxByPurchasePrice(-1);
        });
    }
}
