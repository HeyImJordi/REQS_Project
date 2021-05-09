import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class BedieningTest {

    @Test
    void checkId() {
        Bediening bediening = new Bediening("Jordi", 19);
        assertFalse(bediening.checkId(12,true));
        assertTrue(bediening.checkId(18,true));
        assertFalse(bediening.checkId(23,false));
    }
}


