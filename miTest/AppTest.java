package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    
    static Posfija pf1;

    @BeforeAll public static void setUp() {
        pf1 = new Posfija();
    }

    @Test public void testExpPos1() {
        assertTrue(pf1.evaluar("3 4 * 2 5 + - 4 * 2 /")==10);
    }

    @Test public void testExpPos2() {
        assertTrue(pf1.evaluar("4 5 2 * +")==14);
    }

    @Test public void testExpPos3() {
        assertTrue(pf1.evaluar("9 5 2 + - 3 *")==6);
    }

    @Test public void testExpPos4() {
        assertTrue(pf1.evaluar("5 6 2 + * 12 4 / -")==37);
    }

}