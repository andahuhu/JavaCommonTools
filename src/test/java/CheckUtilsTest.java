import com.zeroten.common.util.CheckUtils;
import org.junit.Assert;
import org.junit.Test;

public class CheckUtilsTest {
    @Test
    public void testIsAnyEmpty(){
        Assert.assertEquals(CheckUtils.isAnyEmpty("123","","hello"),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("123","hello","  "),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(null,"123","hello"),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("123","hello","world"),true);
    }

    @Test
    public void testIsEmpty(){
        Object[] arr = new Object[0];
        Object[] arr1 = new Object[3];
        Assert.assertEquals(CheckUtils.isEmpty(arr),true);
        Assert.assertEquals(CheckUtils.isEmpty(arr1),false);
    }

    @Test
    public void testEqualsString(){
        Assert.assertEquals(CheckUtils.equals(null,""),false);
        Assert.assertEquals(CheckUtils.equals("hello",null),false);
        Assert.assertEquals(CheckUtils.equals("",""),true);
        Assert.assertEquals(CheckUtils.equals("","hello"),false);
        Assert.assertEquals(CheckUtils.equals("hello","hello"),true);
    }

    @Test
    public void testEqualsInteger(){
        Assert.assertEquals(CheckUtils.equals(null,new Integer(3)),false);
        Assert.assertEquals(CheckUtils.equals(new Integer(3),null),false);
        Assert.assertEquals(CheckUtils.equals(new Integer("3"),new Integer(3)),true);
        Assert.assertEquals(CheckUtils.equals(new Integer(3),new Integer(3)),true);
        Assert.assertEquals(CheckUtils.equals(new Integer(5),new Integer(3)),false);
        Assert.assertEquals(CheckUtils.equals(new Integer(5),new Integer("3")),false);

    }
}
