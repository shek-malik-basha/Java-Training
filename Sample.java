import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "HELLO JARVIS";
        System.out.println(System.identityHashCode(s));
        String str = new String("HELLO JARVIS");
        String new_str = new String();
        new_str = "Hello Jarvis";
        System.out.println(s==str);
        System.out.println(new_str==str);
        System.out.println(new_str==s);
    }
}
