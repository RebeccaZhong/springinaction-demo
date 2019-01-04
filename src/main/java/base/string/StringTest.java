package base.string;

/**
 * @Author: 钟燕
 * @Description:
 * @Date: Created in 2019/1/4 15:08
 * @Modified By:
 */
public class StringTest {

    public static void main (String[] args) {
        String a = "abc", b = "ab"+"c";
        System.out.println(a.equals(b));    // true
        System.out.println(a == b); // true

        String c = null, d = null;
        String m = c + d;
        System.out.println(m);  // ??
        System.out.println(m.equals("nullnull"));  // ??
        System.out.println(m == "nullnull");  // ??
        System.out.println(m.getClass());  // ??

    }
}
