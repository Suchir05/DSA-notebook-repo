import java.util.*;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");    
        int num = sc.nextInt();
        String ternary = ((num % 2) == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + ternary);
        sc.close();
    }
}

