/**
 * Created by bizplay on 2017-08-08.
 */
public class Example_14 {
    public static void main(String[] args) {
        // javap -private Network$Member 결과
        /*
         public class object.Network$Member extends java.lang.Object{
              private java.lang.String name;
              private java.util.ArrayList friends;
              final object.Network this$0;
              public object.Network$Member(object.Network, java.lang.String);
              public void leave();
              public void addFriend(object.Network$Member);
              public boolean belongsTo(object.Network);
              public java.lang.String toString();
          }
        */

        /* 외부 클래스에 대한 참조는 어디에 있는가? */
        /*
        * final object.Network this$0;
        * public object.Network$Member(object.Network, java.lang.String);
        *
        * this 키워드와 생성자, addFriend 메소드의 파라미터 변수에 외부 클래스 참조가 있다.
        */

    }
}
