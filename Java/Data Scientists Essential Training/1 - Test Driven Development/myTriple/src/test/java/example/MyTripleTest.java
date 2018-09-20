package example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyTripleTest {

    @Test
    public void testInstantiation() {
        MyTriple myTriple = new MyTriple();
    }

    @Test
    public void testWrongCalculation() {
        MyTriple myTriple = new MyTriple();
        int result = myTriple.createTriple(5);
        assertNotEquals(20, result);
    }
}