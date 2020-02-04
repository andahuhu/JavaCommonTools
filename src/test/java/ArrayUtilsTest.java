import com.zeroten.common.util.ArrayUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtilsTest {
    @Test
    public void testSort(){//数组排序校验
        //示例：定义一个大小为 100 的 int 数组，
        int[] arr = new int[100];
        //随机给每一位赋值一个 `0 ~ 100` 之间的数值，
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println("arr = " + Arrays.toString(arr));
        //然后对该数组进行排序并打印排序结果。
        ArrayUtils.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
