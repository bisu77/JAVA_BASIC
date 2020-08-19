package object.Example_16;

import java.util.ArrayList;

/**
 * Created by bizplay on 2017-08-11.
 */
public class Queue {
    public static class Node{
        private String node;
        public Node(String node){
            this.node = node;
        }
        public String getNode(){
            return node;
        }
        public void setNode(String node){
            this.node=node;
        }
    }
    public class Iterator{
        private int index = 0;
        public boolean hasNext(){
            return data.size()>index;
        }
        public Node next(){
            return data.get(index++);
        }
    }
    private ArrayList<Node> data = new ArrayList<>();

    public void add(Node node){
        data.add(node);
    }

    public Node remove(){
        Node node = null;
        if(data.size()>0) {
            node = data.get(0);
            data.remove(0);
        }
        return node;
    }

    public int size(){
        return data.size();
    }

    public Iterator getIterator(){
        return new Iterator();
    }
}
