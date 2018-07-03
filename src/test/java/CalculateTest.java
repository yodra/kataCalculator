import es.leanmind.Calculate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateTest {

    /**
     * "4" = 4
     * "1,1" = 2
     * "1,1,1" = 3
     * "1,?" = 1
     */

    @Test
    public void calculateSumStr() {
        Calculate calculate = new Calculate();
        int result = calculate.sumStr("1");
        assertEquals(result, 1);
    }
}
