import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();
        int o =n;
        int r = n%10;
        int rev =0;
        while( n!=0){
            rev = rev*10 + r;
            n = n/10;
            r = n%10;
        }
        System.out.println("Original number: " + o);
        System.out.println("Reversed number: " + rev);
        sc.close();
    }
}
