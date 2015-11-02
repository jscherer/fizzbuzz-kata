package test;

import main.FizzBuzzer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzerTest {

    private FizzBuzzer fb;

    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzzer();
    }

    @Test
    public void shouldReturnOne() {
        assertEquals("1", fb.generate(1));
    }

    @Test
    public void shouldReturnTwo() {
        assertEquals("2", fb.generate(2));
    }

    @Test
    public void shouldReturnFizz() {
        assertEquals("Fizz", fb.generate(3));
    }

    @Test
    public void shouldReturnBuzz() {
        assertEquals("Buzz", fb.generate(5));
    }

    @Test
    public void shouldReturnFizzBuzz() {
        assertEquals("FizzBuzz", fb.generate(15));
    }

}