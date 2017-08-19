import java.util.*;

public class CollectionMap_For {

    public static void main(String[] args) {

        // Map
        Map<String,String> map = new HashMap<String,String>();

        map.put("a","김철수");
        map.put("b","홍길동");
        map.put("c","박지성");

        System.out.println("keySet : " + map.keySet());
        // 방법 1
        for(String key : map.keySet()){
            System.out.println("key : " + key + "  value : " + map.get(key));
        }

        System.out.println("===============================================================");
        System.out.println("entry Set : " + map.entrySet());
        // 방법2
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println("key : " + entry.getKey() + "  value : " + entry.getValue());
        }

        System.out.println("===============================================================");
        // HashSet
        HashSet<Integer> hash = new HashSet<Integer>();
        hash.add(3);
        hash.add(6);
        hash.add(9);

        for(int i : hash){
            System.out.println(i);
        }
        System.out.println("===============================================================");

        // List
        List<String> list = new ArrayList<String>();
        list.add("가");
        list.add("나");
        list.add("다");

        for(String i : list){
            System.out.println(i);
        }


        // 객체를 담은 map
        Tiger t = new Tiger(50,100);
        Tiger t2 = new Tiger(40,80);
        Map<String,Tiger> map2 = new HashMap<String,Tiger>();

        map2.put("real",t);
        map2.put("brca",t2);

        System.out.println("keySet : " + map2.keySet());
        for(String key : map2.keySet()){
            System.out.println("key : " + key + "  value(weight) : " + map2.get(key).weight + "  value(height) : " + map2.get(key).height);
        }
    }
    static class Tiger{
        int weight;
        int height;

        Tiger(int weight, int height){
            this.weight=weight;
            this.height=height;
        }
    }
}