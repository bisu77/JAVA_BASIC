import object.Example_16.Queue;

import java.util.ArrayList;

/**
 * Created by bizplay on 2017-08-08.
 */
public class Example_16 {
    public static void main(String[] args) {
        /*
        Queue라는 객체에 Node객체는 내부클래스 역할?
        Queue라는 객체에 Node객체는 정적클래스 역할?

        Queue라는 객체안에 Node라는 객체가 들어가 있다.
        따라서 Queue 객체의 멤버변수와 같은 개념으로 활용할 수 있도록
        Node클래스는 정적클래스로 선언하여 구현하였다.
        */

        Queue queue1 = new Queue();                                 // 큐1

        Queue.Node node = new Queue.Node("node1-1");        // 노드1
        Queue.Node node2 = new Queue.Node("node2-1");       // 노드2

        queue1.add(node);                                           // 큐1에 노드1/노드2 추가
        queue1.add(node2);


        Queue queue2 = new Queue();                                 // 큐2
        Queue.Node node3 = new Queue.Node("node3-1");        // 노드3

        queue2.add(node3);                                          // 큐2에 노드 3 추가
    }
}
