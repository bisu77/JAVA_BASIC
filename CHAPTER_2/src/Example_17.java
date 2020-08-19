import object.Example_16.Queue;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by bizplay on 2017-08-08.
 */
public class Example_17 {
    public static void main(String[] args) {
        Queue queue1 = new Queue();                                 // 큐1

        Queue.Node node = new Queue.Node("node1-1");        // 노드1
        Queue.Node node2 = new Queue.Node("node2-1");       // 노드2

        queue1.add(node);                                           // 큐1에 노드1/노드2 추가
        queue1.add(node2);


        Queue queue2 = new Queue();                                 // 큐2
        Queue.Node node3 = new Queue.Node("node3-1");        // 노드3

        queue2.add(node3);                                          // 큐2에 노드 3 추가

        Queue.Iterator iterator = queue1.getIterator();

        System.out.println("##################### Queue1 출력 #############################");
        while(iterator.hasNext()){
            Queue.Node tempNode = iterator.next();
            System.out.println(tempNode.getNode());
        }

        System.out.println("##################### Queue2 출력 #############################");
        iterator = queue2.getIterator();
        while(iterator.hasNext()){
            Queue.Node tempNode = iterator.next();
            System.out.println(tempNode.getNode());
        }
    }
}
