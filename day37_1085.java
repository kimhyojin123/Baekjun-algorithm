import java.util.Scanner;

public class day37_1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int [] array=new int[4];
		for(int i=0;i<4;i++) {
			array[i]=scan.nextInt();
		}
		int min=array[3];
		array[2]-=array[0];
		array[3]-=array[1];
		for(int i=0;i<4;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println(min);
	}
}
