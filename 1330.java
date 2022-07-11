import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        int A,B;
        
        Scanner scan = new Scanner(System.in);
        
        A = scan.nextInt();
        B = scan.nextInt();
        
        if(A>B){
            System.out.print('>');
        }
        else if(A<B){
            System.out.print('<');
        }
        else{
            System.out.print("==");
        }
    }
}
