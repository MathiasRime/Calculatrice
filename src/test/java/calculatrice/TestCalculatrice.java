package calculatrice;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCalculatrice {

    static Calculatrice calculatrice;

    @BeforeAll
    static void setUp(){
        calculatrice = new Calculatrice();
    }

    @Test
    public void test_add() throws Exception{
        int res = calculatrice.add(2,2);
        assertEquals(4,res);
    }

    @Test
    public void test_sub() throws Exception{
        int res = calculatrice.sub(6,12);
        assertEquals(-6,res);
    }

    @Test
    public void test_multiple() throws Exception{
        int res = calculatrice.multiple(3,4);
        assertEquals(12,res);
    }

    @Test
    public void test_divide() throws Exception{
        int res = calculatrice.divide(12,3);
        assertEquals(4,res);
    }

    @Test
    public void test_divide_by_0() throws Exception{
        int res = calculatrice.divide(12,0);
        assertEquals(-1,res);
    }

    @Test
    public void test_average() throws Exception{
        int [] avg = {1,2,3};
        float res = calculatrice.average(avg);
        assertEquals(2,res);
    }

}
