import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bruiloftCateringTest {

    @Test
    void bruiloftOrder() {
        assertEquals(1795.0, bruiloftCatering.bruiloftOrder(false,100,false,0),0.001);
        assertEquals(1795.0, bruiloftCatering.bruiloftOrder(true,100,false,0),0.001);
        assertEquals(1857.5, bruiloftCatering.bruiloftOrder(true,100,true,5),0.001);
        assertEquals(2280.0, bruiloftCatering.bruiloftOrder(true,200,true,10),0.001);
        assertEquals(3797.5, bruiloftCatering.bruiloftOrder(true,500,true,5),0.001);
        assertEquals(3735.0, bruiloftCatering.bruiloftOrder(false,500,false,0),0.001);
        assertEquals(2175.0, bruiloftCatering.bruiloftOrder(true,200,false,0),0.001);
        assertEquals(2175.0, bruiloftCatering.bruiloftOrder(false,200,false,0),0.001);

    }
}