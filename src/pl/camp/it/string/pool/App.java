package pl.camp.it.string.pool;

public class App {
    public static void main(String[] args) {
        /*String s1 = "ABC";
        //String s2 = "ABC";
        String s2 = new String("ABC7");
        String s3 = new String("ABC7");

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);*/

        String s1 = "ABC";
        String s2 = s1;

        System.out.println(s1);
        System.out.println(s2);

        s1 = s1 + "XYZ";

        System.out.println(s1);
        System.out.println(s2);


    }
}
