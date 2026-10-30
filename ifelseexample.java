//   uppercase 1,lowercase 0, neither -1;
import java.util.*;
public class ifelseexample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c=str.charAt(0);
        if(c>='A' && c<='Z'){
            System.out.println(1);
        }else if(c>='a' && c<='z'){
            System.out.println(0);
        }else{
            System.out.println(-1);
        }
    }
}
