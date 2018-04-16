import java.util.*;

public class StringDecomp {
    String s = "I'd go, but I'm broke.";

    char c1 = s.charAt(7); 
    System.out.println(c1); // ','

    char c2 = s.charAt(10);
    System.out.println(c2); // ''

    int idx1 = s.indexOf(',');
    System.out.println(idx1);

    int idx2 = idx1 + 3;
    System.out.println(idx2);

    char c3 = s.charAt(idx1);
    System.out.println(c3);

    char c4 = s.charAt(s.indexOf(c2) + 2);
    System.out.println(c4);

    char c5 = s.charAt(s.length() - 1);
    System.out.println(c5);

    int idx3 = s.indexOf('\'');
    System.out.println(idx3);

    int idx4 = s.indexOf("go");
    System.out.println(idx4);
}