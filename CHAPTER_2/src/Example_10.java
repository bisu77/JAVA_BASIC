import object.RandomNumbers;

import java.util.ArrayList;

/**
 * Created by bizplay on 2017-08-08.
 */
public class Example_10 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("배열 랜덤 값 : " + RandomNumbers.randomElement(array));
        System.out.println("리스트 랜덤 값 : " + RandomNumbers.randomElement(list));

        /*
        * int[]나 ArrayList<Integer>의 인스턴스 메서드로 만들 수 없는 이유 :
         * 인스턴스 메서드이기 때문에 메서드를 호출할 때 마다 Random클래스가 각 객체마다 할당되어서
         * 비효율 적일 수는 있겠지만 만들 수는 있을 거 같다(?)
         * 안 되는 것이면 왜 안되는 것인지 잘 모르겠다.
         * ex)
            public int randomElement(ArrayList<Integer> list)
            {
                if(list.size()==0)
                    return 0;
                Random generator = new Random();
                int index = generator.nextInt(list.size());
                return list.get(index);
            }
         */
    }
}
