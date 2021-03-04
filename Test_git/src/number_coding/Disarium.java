package number_coding;
import java.util.Scanner;

public class Disarium {

	public static void main(String[] args) {
		// example of Disarium numner sum of power of respective position of digit is number itself (173)	
		Scanner kb = new Scanner(System.in);
		char ch;
		do {
		System.out.println("ENTER THE NUMBER ");
		int num=kb.nextInt();
		int tmp=0,count_digit=0, num1=num, num2=num,sum=0;
		while(num1!=0)
		{
			num1/=10;
			count_digit++;
		}
		while(num2!=0)
		{
			tmp=num2%10;
			int tmp1=1;
			//System.out.println(tmp);
			for(int i=0;i<count_digit;i++)
				tmp1*=tmp;
			count_digit--;
			num2/=10;
			sum+=tmp1;
			//System.out.println(tmp1);
		}
		if(sum==num)
		System.out.println("The Number "+num+" is a Disarium number");
		else
		System.out.println("Not Disarium");
		System.out.print("Wants to check for another number Y/N: ");
		ch=kb.next().charAt(0);
	
		}while(ch=='Y'||ch=='y');
	}
}
