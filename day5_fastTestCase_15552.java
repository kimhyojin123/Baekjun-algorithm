import java.io.*;

public class day5_fastTestCase_15552 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int n=Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
				String[] num = br.readLine().split(" ");
                bw.write(Integer.parseInt(num[0])+ Integer.parseInt(num[1]) + "\n");
			}
			bw.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
