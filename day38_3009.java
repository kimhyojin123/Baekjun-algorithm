import java.util.Scanner;

public class day38_3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int [][] array =new int[3][2];
		int x=0;
		int y=0;
		for(int i=0;i<3;i++) {
			array[i][0]=scan.nextInt();
			array[i][1]=scan.nextInt();
		}
		if(array[0][0]==array[1][0]) x=array[2][0];
		else if(array[0][0]==array[2][0]) x=array[1][0];
		else x=array[0][0];
		
		if(array[0][1]==array[1][1]) y=array[2][1];		
		else if(array[0][1]==array[2][1]) y=array[1][1];		
		else y=array[0][1];
		
		System.out.println(x+" "+y);
		
	}

}
