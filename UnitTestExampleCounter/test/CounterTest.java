package test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest extends TestCase {
    Counter counter1;
    @Before
    public void setUp() throws Exception {
        counter1 = new Counter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void increment() {
        TestCase.assertTrue(counter1.increment() == 1);
        TestCase.assertTrue(counter1.increment() == 2);
    }

    @Test
    public void decrement() {
        TestCase.assertTrue(counter1.decrement() == -1);
    }

    @Test
    public void getCount() {
    }
}