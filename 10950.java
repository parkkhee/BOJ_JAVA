import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        int num;
        int i;
        int A,B;
        
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        
        for(i=0; i<num; i++){
            A= scan.nextInt();
            B= scan.nextInt();
            System.out.println(A+B);
        }
    }
}
