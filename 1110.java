import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 문제 해결 소스 코드
        int N = sc.nextInt();
        int newNum=N;
        int cnt=0;
        
        while(true){
             
             newNum=(newNum%10)*10+((newNum/10+newNum%10)%10);
             cnt=cnt+1;
             if(N==newNum){
                 break;
             }
        }
        
        System.out.print(cnt);
        sc.close();
    }
    
}
