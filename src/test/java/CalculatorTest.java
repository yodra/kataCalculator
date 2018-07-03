import es.leanmind.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    /**
     * "4" = 4
     * "1,1" = 2
     * "1,1,1" = 3
     * "1,?" = 1
     */

    @Test
    public void debe_retornar_cero_con_valor_vacio() {
        Calculator calculator = new Calculator();
        int result = calculator.sumStr("");
        assertEquals(result, 0);
    }

    @Test
    public void debe_retornar_mismo_valor_recibido() {
        Calculator calculator = new Calculator();
        int result = calculator.sumStr("1");
        assertEquals(result, 1);
    }

    @Test
    public void suma_dos_numeros() {
        Calculator calculator = new Calculator();
        int result = calculator.sumStr("1,1");
        assertEquals(result, 2);
    }

    @Test
    public void suma_mas_de_dos_numeros() {
        Calculator calculator = new Calculator();
        int result = calculator.sumStr("1,1,1");
        assertEquals(result, 3);
    }

    @Test
    public void ignora_un_caracter_no_numerico() {
        Calculator calculator = new Calculator();
        int result = calculator.sumStr("1,a");
        assertEquals(result, 1);
    }

    @Test
    public void ignora_varios_caracteres_no_numericos() {
        Calculator calculator = new Calculator();
        int result = calculator.sumStr("+,1,l,&");
        assertEquals(result, 1);
    }
}
