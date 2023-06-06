import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		int count = 1;
		int result = 0;
		//값 집어넣기
		for(int i=0; i<end; i++) {
			for(int j=0; j<count; j++) {
				list.add(count);
			}
			count++;
		}
		

		for(int i=start; i<=end; i++) {
			result += list.get(i-1);
		}
		

		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();
	}
}
