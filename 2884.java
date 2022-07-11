import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        int A,B;
        int num;
        
        Scanner scan = new Scanner(System.in);            
        
        A=scan.nextInt();
        B=scan.nextInt();
        num=B-45;
        if(num<0){
            if(A==0){
                A = 23;
            }
            else{
                A = A-1;
            }
            B = 60+num;            
            System.out.println(A);
            System.out.println(B);
        }
        else{
            System.out.println(A);
            System.out.println(num);
        }
    }
}
