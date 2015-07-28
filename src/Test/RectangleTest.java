package Test;

import Model.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ROHIT on 28-07-2015.
 */
public class RectangleTest {

    @Test
    public void TestCalculateArea(){

        assertEquals(20,(new Rectangle(5,4)).CalculateArea());
        assertEquals(18,(new Rectangle(6,3).CalculateArea()));
    }
}