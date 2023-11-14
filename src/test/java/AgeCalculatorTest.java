import org.example.AgeCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCalculatorTest {
    @Test
    public void testUserIs18OrOlder() {
        String validDOB = "2005-01-01"; // A date that is 18 years ago or older
        Assert.assertTrue(AgeCalculator.isUser18OrOlder(validDOB));
    }

    @Test
    public void testUserIsYoungerThan18() {
        String invalidDOB = "2010-06-30"; // A date that is younger than 18 years
        Assert.assertFalse(AgeCalculator.isUser18OrOlder(invalidDOB));
    }

    @Test
    public void testUserIsExactly18() {
        String exactly18DOB = "2004-11-13"; // A date exactly 18 years ago
        Assert.assertTrue(AgeCalculator.isUser18OrOlder(exactly18DOB));
    }

//    @Test
//    public void testInvalidDateFormat() {
//        String invalidDateFormat = "1995/08/25"; // Invalid date format
//        Assert.assertFalse(AgeCalculator.isUser18OrOlder(invalidDateFormat));
//    }
}
