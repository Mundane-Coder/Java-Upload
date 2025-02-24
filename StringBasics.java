package defualt1;
import java.util.*;
public class StringBasics {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("give a String");
		String name=input.nextLine();
		String name2=new String();  
		String name3=new String(name);
		byte arr[]= {97, 98, 99, 100, 101, 102, 103, 104, 105};
		String name4=new String(arr);
		String str=new String(arr,6,3);
		System.out.println(name);
		System.out.println("Empty String--> "+name2);
		System.out.println("String through parameterized consrtuctor--->  "+name3);
		System.out.println(name4);
		System.out.println("Substring--> "+str);
	}
}
