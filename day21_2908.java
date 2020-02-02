import java.util.Scanner;

public class day21_2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String [] array=new String[2];
		int [] answer=new int[2];
		for(int i=0;i<2;i++) {
		    array[i]=scan.next();
		}
		for(int i=0;i<2;i++) {
			String temp;
			temp=array[i].substring(2, 3);
		    for(int j=1;j>=0;j--) {
		    	temp=temp.concat(array[i].substring(j, j+1));
		    }
			answer[i]=Integer.parseInt(temp);
			
		}
		if(answer[0]<answer[1]) {
			System.out.println(answer[1]);
		}
		else{
			System.out.println(answer[0]);
		}
		}

}
