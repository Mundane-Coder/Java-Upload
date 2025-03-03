package defualt1;
import java.util.*;
public class Touppercase {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("give the first String");
		String name1=input.nextLine();
		
		System.out.println("the lower case is "+name1.toUpperCase());
		System.out.println("the lower case is "+name1.toLowerCase());
	}
}
