package n1ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MonthTest2 {

    private Month month;

    @BeforeEach
    public void setUp() {
        month = new Month(); 
    }

    @Test
    public void testMonthInitialization() {
        ArrayList<String> months = month.getMonths();
        assertNotNull(months);
        assertEquals(12, months.size());
        assertEquals("Enero", months.get(0));
        assertEquals("Diciembre", months.get(11));
        /* assertEquals("Agosto", months.get(6)); de este modo da error */
        assertEquals("Agosto", months.get(7));
        
    }
}