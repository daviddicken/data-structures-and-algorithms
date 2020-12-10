package codewars;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class ProductFibTest {
    @Test
        public void test1() {
            long[] r = new long[] {55, 89, 1};
            assertArrayEquals(r, ProductFib.productFib(4895));
        }
        @Test
        public void test2() {
            long[] r = new long[] {89, 144, 0};
            assertArrayEquals(r, ProductFib.productFib(5895));
        }
    }

