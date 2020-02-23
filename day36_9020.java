import java.util.Scanner;

public class day36_9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		int []data=new int[10001];
		for(int i=0;i<10001;i++) data[i]=i;
		for(int i=2;i<10001;i++) {
			for(int j=i*2;j<10001;j+=i) {
				if(data[j]==0) continue;
				data[j]=0;
			}
		}
		for(int i=0;i<test;i++) {
			int n=scan.nextInt();
			boolean check=true;
			for(int j=n/2;j<n;j++) {
				if(check) {
				if(data[j]!=0&&data[n-j]!=0) {
					System.out.println(data[n-j]+" "+data[j]);
					check=false;
				}
				}
			}
		}
	}

}
