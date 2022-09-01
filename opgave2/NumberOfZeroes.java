package opgave2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfZeroes {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(0,12,2,0,3,0));
        System.out.println(countZero(listOfNumbers));
    }

    public static int countZero(List<Integer> list){
        return countZero(list, 0, list.size() - 1);
    }

    private static int countZero(List<Integer> list,int l, int h){
        if(l == h){
            if(list.get(l) == 0){
                return 1;
            }else{
                return 0;
            }
        }
        int m = (l + h) /2;
        int leftHalf = countZero(list,l,m);
        int rightHalf = countZero(list,m +1, h);

        return leftHalf + rightHalf;
    }
}
