import java.util.Scanner;

public class day10_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int [] array=new int[3];
		int [] array1=new int[10];
		int result=1;
		for(int i=0;i<3;i++) {
			array[i]=scan.nextInt();
			result*=array[i];
		}
		while(result!=0) {
			array1[result%10]+=1;
			result/=10;
		}
		for(int i=0;i<10;i++) {
			System.out.println(array1[i]);
		}
      
	}

}
