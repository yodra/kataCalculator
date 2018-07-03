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
    public void debe_retornar_mismo_valor_recibido() {
        Calculate calculate = new Calculate();
        int result = calculate.sumStr("1");
        assertEquals(result, 1);
    }

    @Test
    public void suma_dos_numeros() {
        Calculate calculate = new Calculate();
        int result = calculate.sumStr("1,1");
        assertEquals(result, 2);
    }

    @Test
    public void suma_mas_de_dos_numeros() {
        Calculate calculate = new Calculate();
        int result = calculate.sumStr("1,1,1");
        assertEquals(result, 3);
    }

    @Test
    public void ignora_cualquier_caracter_no_numerico() {
        Calculate calculate = new Calculate();
        int result = calculate.sumStr("1,a");
        assertEquals(result, 1);
    }

}
