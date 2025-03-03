package defualt1;
import java.util.*;
public class SplitSentence {
	public static void main(String[]args) {
		Scanner br=new Scanner(System.in);
		System.out.println("give ur sentence ");
		String sentence=br.nextLine();
		String[] words=sentence.split(" ");
		for(String str:words) {
			System.out.println(str+" ");
		}
				
	}
}
