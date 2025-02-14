import java.util.*;

public class Basics  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        // String name = sc.nextLine();
        // System.out.println(name);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = a * b;
        // System.out.println(product);
        // float rad = nived.nextFloat();
        // float area = 3.14f * rad * rad;
        // System.out.println(area);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
     int largest = a > b ? (a > c ? a : c) : (b > c ? b : c);
     System.out.println("The largest number is: " + largest);
     }
}
//boilerplate code
        // System.out.println("dahn le");
        // System.out.println("mat le");
        // int number = 22;
        // System.out.println(number); 
        // int a = 4;
        // int b = 6;
        // int sum = a + b;        // System.out.println(sum);