import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;

public class Problem2Test {

    private Problem2 sorter = new Problem2();

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        // assertTrue(false);
        // add your tests here
        int[] data = {5, 4 , 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        Problem2.bubbleSort(data);

        assertTrue(Arrays.equals(expected, data));


    }

}





