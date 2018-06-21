package pascaltri;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owori Juma
 */
public class PascalTriTest {

    public PascalTriTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        int rowIndex = 3;
        int[] number = {1, 3, 3, 1};
        List<Integer> expResult = Arrays.stream(number).boxed().collect(Collectors.toList());;
        List<Integer> result = PascalTri.getRowResult(rowIndex);
        assertEquals(expResult, result);        
    }

}
