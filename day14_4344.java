import java.util.Scanner;

public class day14_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Double[] rate=new Double[n];
		
		for(int i=0;i<n;i++) {
			int a=scan.nextInt();
			int [] score=new int[a];
			int sum=0;
			int cnt=0;
			for(int j=0;j<a;j++) {
				score[j]=scan.nextInt();
				sum += score[j];
			}
			double avg=(double)sum/a;
			for(int j=0;j<a;j++) {
				if(score[j]>avg) {
					cnt++;
				}
			}
			rate[i]=100.0*cnt/a;
		}
		for(int i=0;i<n;i++) {
			System.out.printf("%.3f",rate[i]);
			System.out.println("%");
			}
	}

}
