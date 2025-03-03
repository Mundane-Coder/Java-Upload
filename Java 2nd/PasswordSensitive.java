package default2;
import java.util.*;
public class PasswordSensitive {
		public static void main(String[]args) {
			Scanner br=new Scanner(System.in);
			System.out.println("Set your password");
			String word1=br.next();
			System.out.println("put your password");
			String word2=br.next();
			if(word1.equals(word2))
					System.out.println("Permission Granted");
			else
				System.out.println("Access denied");
			
		}
}
