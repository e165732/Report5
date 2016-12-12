/**
 * Created by e165732 on 2016/12/13.
 */
public class Main {
    public static void main(String[] args) {
        try {
            String str = "3．14";
            double value = Double.parseDouble(str);
            System.out.println(str.length());
        } catch(NullPointerException n) {
            System.out.println("NullPointerExceptionが発生した。");
            n.printStackTrace();
        }
    }
}