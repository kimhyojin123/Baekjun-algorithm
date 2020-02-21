import java.util.Scanner;

public class day35_4989 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(true) {
			int n=scan.nextInt();
			if(n<=0) break;
			int cnt=0;
			int [] data=new int[2*n+1];
			for(int i=1;i<2*n+1;i++)
				data[i]=i;
			for(int i=2;i<2*n+1;i++) {
				for(int j=i*2;j<2*n+1;j+=i) {
					if(data[j]==0) continue;
					data[j]=0;
				}
			}
			for(int i=n+1;i<=2*n;i++) {
				if(data[i]!=0)cnt++;				
			}
			System.out.println(cnt);	
		}
		
	}
}
