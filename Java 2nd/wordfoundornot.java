package default2;
import java.util.*;
public class wordfoundornot {
	public static void main(String[]args) {
		Scanner br=new Scanner(System.in);
		int flag=0;
		System.out.println("give your sentence");
		String word1=br.nextLine();
		System.out.println("put your word");
		String word2=br.next();
		String[] words=word1.split(" ");
		for(String it:words) {
			if(it.equalsIgnoreCase(word2)) {
					System.out.println("it exits");
					flag=1;
					break;
			}
		}
		if(flag==0)
				System.out.println("does not exits");
	}
}
