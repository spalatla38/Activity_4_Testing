import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpdatedAverageTest {
    Average avg = new Average();

    @Test
    @DisplayName("Average with Empty List")
    public void averageWithEmptyList() {
        int[] empty_list = new int[0];

        // Test Case 1 : k < 0 and list.length = 0
        // Expected Output : 0
        assertEquals(0, avg.average(-1, empty_list));
        assertEquals(0, avg.average(-10, empty_list));
        assertEquals(0, avg.average(-5829, empty_list));

        // Test Case 2 : k = 0 and list.length = 0
        // Expected Output : 0
        assertEquals(0, avg.average(0, empty_list));

        // Test Case 3 : k > 0 and list.length = 0
        // Expected Output : 0
        assertEquals(0, avg.average(1, empty_list));
        assertEquals(0, avg.average(10, empty_list));
        assertEquals(0, avg.average(8648, empty_list));
    }

    @Test
    @DisplayName("Average with Non-empty List")
    public void averageWithNonEmptyList(){
        int[] singleElementList = {91};
        int[] multipleElementList = {83, 11, 23, 37, 47, 53, 67, 71};

        // Test Case 4 : k < 0 and list.length > 0
        // list containing a single element
        // Expected Output : 0
        assertEquals(0, avg.average(-1, singleElementList));
        assertEquals(0, avg.average(-10, singleElementList));
        assertEquals(0, avg.average(-1243, singleElementList));

        // list containing more than one element
        // Expected Output : 0
        assertEquals(0, avg.average(-1, multipleElementList));
        assertEquals(0, avg.average(-10, multipleElementList));
        assertEquals(0, avg.average(-1243, multipleElementList));

        // Test Case 5 : k = 0 and list.length > 0
        // list containing a single element
        // Expected Output : 0
        assertEquals(0, avg.average(0, singleElementList));

        // list containing more than one element
        // Expected Output : 0
        assertEquals(0, avg.average(0, multipleElementList));

        // Test Case 6 : k > 0 and list.length > 0
        // list containing a single element
        // Expected Output : 91
        assertEquals(91, avg.average(1, singleElementList));
        assertEquals(91, avg.average(10, singleElementList));
        assertEquals(91, avg.average(1111, singleElementList));

        // list containing more than one element
        // Expected Output : 49
        assertEquals(83, avg.average(1, multipleElementList));
        assertEquals(49, avg.average(10, multipleElementList));
        assertEquals(49, avg.average(9764, multipleElementList));

        // Test Case that are designed to fail
        // Expected output : 0, Actual Output : 0
        assertEquals(0, avg.average(0, singleElementList));

        // Expected output : 0, Actual Output : 0
        assertEquals(0, avg.average(0, multipleElementList));

        // Expected output : 39, Actual Output : 39
        assertEquals(39, avg.average(3, multipleElementList));

        //  Expected output : 38, Actual Output : 38
        assertEquals(38, avg.average(4, multipleElementList));
    }
}