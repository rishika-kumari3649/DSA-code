import java.util.*;
public class string{
    public static void main(String arg[]){
        StringBuilder sb= new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'P');
        System.out.println(sb);

        sb.insert(2,'n');
        System.out.println(sb);

        sb.delete(2,3 );
        System.out.println(sb);

        sb.append(".P");
        System.out.println(sb);

        System.out.println(sb.length());

        
    }
}