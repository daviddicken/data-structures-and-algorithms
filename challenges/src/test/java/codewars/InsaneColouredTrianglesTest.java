package codewars;

import challenges.BinarySearch;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class InsaneColouredTrianglesTest {

        @Test
        public void examples() {
            assertEquals('B', InsaneColouredTriangles.triangle("B"));
            assertEquals('R', InsaneColouredTriangles.triangle("GB"));
            assertEquals('R', InsaneColouredTriangles.triangle("RRR"));
            assertEquals('B', InsaneColouredTriangles.triangle("RGBG"));
 //      assertEquals('G', InsaneColouredTriangles.triangle("RBRGBRB"));
 //     assertEquals('G', InsaneColouredTriangles.triangle("RBRGBRBGGRRRBGBBBGG"));

        }

}
