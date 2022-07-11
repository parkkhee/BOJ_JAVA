import java.util.*;
import java.io.*;

class Person implements Comparable<Person>{
  public int num;
  public int age;
  public String name;

  public Person(int num, int age, String name){
    this.num=num;
    this.age=age;
    this.name=name;
  }
  @Override
  public int compareTo(Person other){
    
    if(this.age == other.age){
      return this.num - other.num;
    }
    else
      return this.age - other.age;
  }
  @Override
  public String toString(){
    return age + " " + name;
  }

}

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
        ArrayList<Person> ls = new ArrayList<>();

        int n = fr.nextInt();

        for(int i =0; i<n; i++){
          int age = fr.nextInt();
          String name  = fr.next();

          ls.add(new Person(i, age, name));
        }

        Collections.sort(ls);

        for(int i=0; i<n; i++)
          System.out.println(ls.get(i));
                
    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}
