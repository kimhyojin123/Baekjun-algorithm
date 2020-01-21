import java.util.Scanner;

public class day12_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		float sum=0;
		float result;
		float []array=new float[n];
		for(int i=0;i<n;i++) {
			array[i]=scan.nextInt();
		}
		float m=0;
		for(int i=0;i<n;i++) {
			if(m<array[i]) {
				m=array[i];
			}
		}
		for(int i=0;i<n;i++) {

			array[i]=array[i]/m*100;
			
			System.out.print(array[i]);
			sum+=array[i];
		}
		System.out.print(sum);
		result=sum/n;
		System.out.printf("%.2f",result);
	}

}
