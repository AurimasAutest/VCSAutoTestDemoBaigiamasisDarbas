package introduction;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalTime;

public class Demo {

    @Test
    public void testIfNumber4IsEven() {

//duomenys
        int actualImput = 4;
        int expedctedResults = 0;
        int actualResults;
//        testo veiksmas

        actualResults = actualImput % 2;

//        palyginimas
        Assert.assertEquals(actualResults, expedctedResults);

    }

    @Test
    public void testIfNumber5IsNotEven() {

//duomenys
        int actualImput = 5;
        int expedctedResults = 1;
        int actualResults;
//        testo veiksmas

        actualResults = actualImput % 2;

//        palyginimas
        Assert.assertTrue(actualResults == expedctedResults);

    }

    @Test
    public void testifTaimNowisNot19Hour() {

        int notExpextedTime = 19;
        int actualTime;
        boolean isSameTime;


        actualTime = LocalTime.now().getHour();

        isSameTime = notExpextedTime == actualTime;

        Assert.assertFalse(isSameTime, String.format("Expected: %s, Acutal: %s", notExpextedTime, actualTime)
        );
    }
}
