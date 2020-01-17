import java.util.Scanner;

public class day9_2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int [] answer=new int[2];
		int [] array=new int[9];
		for(int i=0;i<9;i++) {
			array[i]=scan.nextInt();
		}
		answer[0]=0;
		for(int i=0;i<9;i++) {
			if(array[i]>=answer[0]) {
			answer[0]=array[i];
			answer[1]=i+1;
			}
		}
		System.out.print(answer[0]+"\n"+answer[1]);
		scan.close();
	}

}
