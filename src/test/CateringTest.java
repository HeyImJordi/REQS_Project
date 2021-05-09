import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CateringTest {

    @Test
    void cateringPrijs() {

        int catering0 = 0;
        int catering1 = 1;
        int catering10 = 10;
        int catering24 = 24;
        int catering26 = 26;
        int catering45 = 45;
        int catering60 = 60;

        assertEquals(0, new Order(catering0).cateringPrijs(), 0.001);
        assertEquals(27.95, new Order(catering1).cateringPrijs(), 0.001);
        assertEquals(279.50, new Order(catering10).cateringPrijs(), 0.001);
        assertEquals(598.80, new Order(catering24).cateringPrijs(), 0.001);
        assertEquals(466.70, new Order(catering26).cateringPrijs(), 0.001);
        assertEquals(807.75, new Order(catering45).cateringPrijs(), 0.001);
        assertEquals(777.0, new Order(catering60).cateringPrijs(), 0.001);

    }
}