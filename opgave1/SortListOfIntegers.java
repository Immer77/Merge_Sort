package opgave1;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortListOfIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,5,1,2,8,2,1,3));
        System.out.println(sum(list));
    }
    //
    public static int sum(List<Integer> list){
        return sum(list,0,list.size() - 1);
    }

    private static int sum(List<Integer> list, int l, int h){
        if(l == h){
            return list.get(l);
        }
        int m = (l + h) /2;
        int sum1 = sum(list, l,m );
        int sum2 = sum(list, m + 1, h);

        return sum1 + sum2;

    }
}
