import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        int A,B;
        
        Scanner scan = new Scanner(System.in);
        
        A=scan.nextInt();
        B=scan.nextInt();
        
        while(A!=0 || B !=0){                       
            System.out.println(A+B);
            A=scan.nextInt();
            B=scan.nextInt();
        }
    }
}
