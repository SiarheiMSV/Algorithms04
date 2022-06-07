import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AscendingSequenceTest {
    @Test
    public void testAscendingSequenceHappyPath() {
        // 0, 1, 2, 3, 4 ,5
        int start = 0;
        int end = 5;
        int step = 0;
        int [] expectedResult = {};

        AscendingSequence as = new AscendingSequence ();
        int [] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testAscendingSequenceHappyPathNegative() {
        // -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5
        int start = 0;
        int end = 5;
        int step = 2;
        int [] expectedResult = {0, 2, 4};

        AscendingSequence as = new AscendingSequence ();
        int [] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
