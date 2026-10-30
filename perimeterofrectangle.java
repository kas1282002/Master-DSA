import java.util.*;
public class perimeterofrectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Perimeter of rectangle");
        System.out.println("Enter length");
        int length=sc.nextInt();
        System.out.println("Enter Breadth");
        int breadth=sc.nextInt();
        System.out.println("Perimeter: "+ 2*(length+breadth));

    }
}
