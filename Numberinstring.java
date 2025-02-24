package defualt1;
import java.util.*;
public class Numberinstring {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("give the first String");
		String name1=input.nextLine();
		int sum=0;
		for(int i=0;i<name1.length();i++) {
			char ch=name1.charAt(i);
			if(Character.isDigit(ch))
				sum+=Character.getNumericValue(ch);
		}
		System.out.println("the sum is "+sum);
}
}

