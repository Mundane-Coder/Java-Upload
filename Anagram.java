package defualt1;
import java.util.*;
public class Anagram {
	public static void main(String[]args) {
		Scanner br=new Scanner(System.in);
		String first=br.next();
		String second=br.next();
		char[] word1=first.toCharArray();
		char[] word2=second.toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		if(Arrays.equals(word1,word2))
				System.out.println("they are anagrams");
		else
				System.out.println("they are not anagrams");
	}
}
