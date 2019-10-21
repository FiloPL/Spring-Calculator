package pl.sda.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sda.spring.operation.OperationType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void shouldReturnFiveForGivenArgumentsOnAdditionOperation() {
        //given
        double arg1 = 2.0;
        double arg2 = 3.0;

        //when
        double actual = calculator.calculate(OperationType.ADDITION, arg1, arg2);

        //then
        Assert.assertEquals(5.0, actual, 0.00000001);
    }

    @Test
    public void shouldReturnTreeForOperationSubtraction() {
        //given
        double arg1 = 5.0;
        double arg2 = 2.0;

        // then
        double actual = calculator.calculate(OperationType.SUBTRACTION, arg1, arg2);

        //when
        Assert.assertEquals(3.0, actual, 0.0000001);
    }

    @Test
    public void shouldCorrentMultiplication() {
        // given
        double arg1 = 6.0;
        double arg2 = 10.0;
        // then
        double actualValue = calculator.calculate(OperationType.MULTIPLICATION, arg1, arg2);
        System.out.println(actualValue);
        // when
        Assert.assertEquals(60.0, actualValue, 0.000001);
    }
    @Test
    public void shuoldCorrectDivisionOperation() {
        //given
        double arg1 = 6.0;
        double arg2 = 2.0;

        // then
        double actual = calculator.calculate(OperationType.DIVISION, arg1, arg2);
        System.out.println(actual);
        //when
        Assert.assertEquals(3.0, actual, 0.0000001);
    }

    @Test( expected = AssertionError.class)
    public void coulndDoDivisionByZeroOperation() {
        double arg1 = 6.0;
        double arg2 = 0.0;

        // then
        double actual = calculator.calculate(OperationType.DIVISION, arg1, arg2);

        //when
        Assert.assertEquals(0.0, actual, 0.0000001);
    }

    @Test
    public void shouldCorrectDoPercentageOperation() {
        // given
        double arg1 = 600.0;
        double arg2 = 10.0;

        // then
        double acutalValue = calculator.calculate(OperationType.PERCENTAGE, arg1, arg2);
        System.out.println(acutalValue);

        // when
        Assert.assertEquals(60.0, acutalValue, 0.000001);
    }

    @Test
    public void shouldCorrectDoPowerTwoValue() {
        // given
        double arg1 = 5.0;
        double arg2 = 4.0;

        // then
        double actualValue = calculator.calculate(OperationType.POWER, arg1, arg2);

        // when
        Assert.assertEquals(625.0, actualValue, 0.00001);
    }


}
