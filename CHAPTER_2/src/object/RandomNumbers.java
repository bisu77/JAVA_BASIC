package object;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by bizplay on 2017-08-10.
 */
public class RandomNumbers {
    private static Random generator = new Random();
    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
    }

    // 배열의 요소 중 임의 값 반환
    public static int randomElement(int []array){
        if(array.length==0)
            return 0;

        int index = generator.nextInt(array.length);
        return array[index];
    }

    // List 요소 중 임의 값 반환
    public static int randomElement(ArrayList<Integer> list){
        if(list.size()==0)
            return 0;
        int index = generator.nextInt(list.size());
        return list.get(index);
    }
}