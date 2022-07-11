import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        int A,B;
        
        Scanner scan = new Scanner(System.in);
        
        A = scan.nextInt();
        B = scan.nextInt();
        
        System.out.println(A*(B%10));
        System.out.println(A*((B%100)/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);
    }
}
