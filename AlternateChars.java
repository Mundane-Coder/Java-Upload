package defualt1;
import java.util.*;
public class AlternateChars {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("give the  String");
		String name1=input.nextLine();
		for(int i=0;i<name1.length();i+=2) {
			System.out.print(name1.charAt(i)+ "  ");
		}
	}
}
