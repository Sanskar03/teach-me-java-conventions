import powerpackage.FindPower;


import org.junit.Test;

public class PowerTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert FindPower.calculatePower(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assert FindPower.calculatePower(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        assert FindPower.calculatePower(2, 2) == 4;
    }

    @Test
    public void threeRaisedToTwoIsNine() {
        assert FindPower.calculatePower(3, 2) == 3*3;
    }
}
