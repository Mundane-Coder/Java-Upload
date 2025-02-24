package defualt1;
public class SubstringGetchars {
	public static void main(String args[]) {
		String name="New world";
		char arr[]=new char[5];
		name.getChars(0,3,arr,0);
		for(char c:arr)
				System.out.print(c);
	}
	
}
