import cdu.jaav.entity.utils.PageTransformate;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class mytest {
    @Test
    public void test1(){
        List<Integer> integers = PageTransformate.pageTransfor(2, 10);
        System.out.println(integers);
    }
}
