import org.junit.Assert;
import org.junit.Test;
import unitcorn.Result;
import unitcorn.UnitCornTestRunner;

/**
 * Created by luisgarcia on 5/5/17.
 */
public class TestUnitCornTestRunner
{
    UnitCornTestRunner tester = new UnitCornTestRunner();
    Double aDouble = 3.333;
    Class aClass = aDouble.getClass();


    @Test
    public void testRunTests()
    {
        TestUnitCornTestRunner paco = new TestUnitCornTestRunner();
        //given
        String expected = "com.sun.proxy.$Proxy1";

        //when
        String actual = tester.runTests(paco.getClass());

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRunTestNoResults()
    {
        //given
        String expected = "No Results";

        //when
        String actual = tester.runTests(aClass);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRunTest()
    {
        TestUnitCornTestRunner paco = new TestUnitCornTestRunner();
        String  myMethod = tester.runTests(paco.getClass());

        //given
        Result myResult = tester.runTest(paco.getClass(), myMethod);
        boolean expected = false;

        //when
        boolean actual = myResult.getPass();

        //then
        Assert.assertEquals(expected, actual);
    }


}
