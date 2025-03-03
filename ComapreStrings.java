package defualt1;

public class ComapreStrings {
		public static void main(String[]args) {
			String name1=new String("Hello");
			String name2=new String("Hello");
			if(name1==name2)
					System.out.println("True");
			else
					System.out.println("False");
			if(name1.compareTo(name2)==0)
				System.out.println("True");
			else
				System.out.println("False");
					
		}
}
