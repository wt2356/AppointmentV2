package cdu.jaav.entity.utils;

import java.util.Arrays;
import java.util.List;

public class PageTransformate {
    public static List<Integer> pageTransfor(int page, int limit){
        int start = 0;
        if (page==1){
            start=0;
        }else {
            start=limit*page;
        }
        List<Integer> pageInf = Arrays.asList(start,limit);
        return pageInf;
    }
}
