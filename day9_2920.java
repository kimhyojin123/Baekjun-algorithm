import java.util.Scanner;

public class day9_2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int []array=new int[8];
		boolean a=true;
		for(int i=0;i<8;i++) {
			array[i]=scan.nextInt();
		}
		if(array[0]==1) {
		for(int i=0;i<7;i++) {
			if((array[i]+1)!=array[i+1]) {
				System.out.print("mixed");
				a=false;
				break;
			}
		}
		if(a) {
			System.out.print("scending");
		}

		}
		else if(array[0]==8) {
			for(int i=0;i<7;i++) {
				if((array[i]-1!=array[i+1])) {
					System.out.print("mixed");
					a=false;
					break;
				}
			}
			if(a) {
			System.out.print("descending");
		}}
		else {
			System.out.print("mixed");
		}
	}

}
