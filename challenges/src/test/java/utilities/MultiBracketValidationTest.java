package utilities;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void bracketTest() {

        assertTrue("Should be true: ", MultiBracketValidation.multiBV("{}"));
        assertFalse("Should be false: ", MultiBracketValidation.multiBV("[{]}"));
        assertFalse("Should be false: ", MultiBracketValidation.multiBV("["));
        assertTrue("Should be true: ", MultiBracketValidation.multiBV("((((code fellows)))){}[]gdhx"));
        assertTrue("Should be true: ", MultiBracketValidation.multiBV("kjhdsnjcdf"));
        assertFalse("Should be false: ", MultiBracketValidation.multiBV("}kjhdsnjcdf"));
        assertFalse("Should be false: ", MultiBracketValidation.multiBV(""));

    }
}

