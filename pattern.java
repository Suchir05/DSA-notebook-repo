import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character for the pattern : ");
        String ch = sc.next();
        System.out.println(ch + ch + ch + ch);
        System.out.println(ch + ch + ch);
        System.out.println(ch + ch);
        System.out.println(ch);
    }
}
    