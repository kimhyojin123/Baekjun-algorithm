import java.io.*;
import java.util.*;

public class day11_3052 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] a=new boolean[42];
		int cnt=0;
		for(int i=0;i<10;i++) {
			int b=Integer.parseInt(br.readLine());
			if(!a[b%42]) {
				a[b%42]=true;
				cnt++;
			}
		}
		bw.write(cnt+"\n");
		bw.flush();
		bw.close();
		br.close();
		
	}

}
