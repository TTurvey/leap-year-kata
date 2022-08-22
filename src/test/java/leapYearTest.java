import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class leapYearTest {

    @Test
    void testOne() {
        assertEquals("1", new LeapYear.convert(1));
    }

}
