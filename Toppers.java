package toppers;
import java.util.Scanner;

public class Toppers{
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		scan.close();
		int temp=number;
		int c=0;
		int sum_odd=0;
		int sum_even=0;
		while(temp>0) {
			c=temp%10;
			if(c%2!=0) {
				sum_odd+=c;
			}
			else
				sum_even+=c;
			temp/=10;
		}
		if(sum_odd==sum_even)
			System.out.print(true);
		else
			System.out.print(false);
	}
	
}