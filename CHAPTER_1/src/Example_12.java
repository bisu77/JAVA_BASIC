/**
 * Created by bizplay on 2017-08-05.
 */
public class Example_12 {
    public static void main(String[] args) {

        // src/java/io/DataInputStream.java
        /*boolean breakWhile = false;

        loop:   while (true) {
            switch (c = in.read()) {
                case -1:
                case '\n':                              // 수정
                    breakWhile = true;
                    break;
                    // break loop;
                case '\r':                              // 수정
                    int c2 = in.read();
                    if ((c2 != '\n') && (c2 != -1)) {
                        if (!(in instanceof PushbackInputStream)) {
                            this.in = new PushbackInputStream(in);
                        }
                        ((PushbackInputStream)in).unread(c2);
                    }
                    breakWhile = true;
                    break;
                    // break loop;

                default:
                    if (--room < 0) {
                        buf = new char[offset + 128];
                        room = buf.length - offset - 1;
                        System.arraycopy(lineBuffer, 0, buf, 0, offset);
                        lineBuffer = buf;
                    }
                    buf[offset++] = (char) c;
                    break;
            }
            // while문을 탈출하려고 할 경우 case에서 break로 나왔을 경우 while문에서 한번 더 break해서 나온다.
            if(breakWhile){
                breakWhile = false;
                break;
            }
        }*/
    }
}
