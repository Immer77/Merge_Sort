package opgave3.fletning;

import java.util.ArrayList;
import java.util.Arrays;

public class TestFlettesortering {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] list = {12,2,31,2,4,5,1,2};
        FletteSorteringHul sort = new FletteSorteringHul();
        sort.fletteSort(list);
        System.out.println();
        System.out.println(Arrays.toString(list));
    }
    
}
