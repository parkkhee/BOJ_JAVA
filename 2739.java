import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        int num;
        int i;
        
        Scanner scan = new Scanner(System.in);
        
        num = scan.nextInt();
        
        for (i =1 ; i<10; i++){
            System.out.print(num + " * " + i + " = ");
            System.out.println(num*i);
        }
    }
}
