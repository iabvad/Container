import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContainerTest {

    @Test
    public void containerContainsZeroLiquidAtStart(){
        Container test1 = new Container();
        assertEquals(0, test1.liquid);
    }

    @Test
    public void amountLiquidChangesWhenAdded(){
        Container test2 = new Container();
        test2.addAmount(14);
        assertEquals(14, test2.liquid);
    }

    @Test
    public void amountLiquidChangesWhenRemoved(){
        Container test3 = new Container();
        test3.addAmount(14);
        test3.remove(4);
        assertEquals (10, test3.liquid);
    }

    @Test
    public void containerFailsOnceFilled(){
        Container test4 = new Container();
        test4.addAmount (102);
        assertEquals(0, test4.liquid);
    }

    @Test
    public void removeMoreLiquidThanCurrentlyHas(){
        Container test5 = new Container();
        test5.addAmount(4);
        test5.remove (5);
        assertEquals (4, test5.liquid);

    }

    @Test
    public void returnTheTotalAmountOutOfOneHundred(){
        Container test6 = new Container();
        test6.addAmount(54);
        assertEquals("54/100", test6.toString());


    }

    @Test
    public void moveTheAmountOfLiquidToAContainer(){
        Container test7 = new Container();
        test7.addAmount (50);
        Container test8 = new Container();
        test7.move (20, test8);
        assertEquals (20,test8.liquid);

    }

    @Test
    public void firstContainerRemainsSameIfSecondContainerDoesntHaveEnough(){
        Container test9 = new Container();
        test9.addAmount (50);
        Container test10 = new Container();
        test9.move (60, test10);
        assertEquals (50, test9.liquid);
        assertEquals(0, test10.liquid);

    }

    @Test
    public void secondContainerRemainsSameIfFirstContainerDoesntHaveEnough(){
        Container test11 = new Container();
        test11.addAmount (50);
        Container test12 = new Container();
        test11.move (60, test12);
        assertEquals(0, test12.liquid);

    }

    @Test
    public void addingNegativeSubtracts(){
        Container test13 = new Container();
        test13.addAmount(12);
        test13.addAmount(-4);
        assertEquals (8, test13.liquid);
    }
}
