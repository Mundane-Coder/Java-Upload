package defualt1;
import java.util.*;
public class IsEqual {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("give the first String");
		String name1=input.nextLine();
		System.out.println("give the second String");
		String name2=input.nextLine();
		if (name1.equals(name2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
	}
}
