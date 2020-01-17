import java.util.Scanner;

public class day9_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=scan.nextInt();
		}
		int min=1000000;
		int max=-1000000;
		for(int i=0;i<n;i++) {
			if(array[i]<=min) {
				min=array[i];
			}
			if(array[i]>=max) {
				max=array[i];
			}
		}	
		System.out.print(min+" "+max);
		scan.close();
	}

}
