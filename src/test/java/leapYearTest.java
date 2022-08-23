import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class leapYearTest {

    @Test
    void testOne() {
        assertEquals(true, new LeapYear.check(1000));
    }

}
