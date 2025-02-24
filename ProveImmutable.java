package defualt1;

public class ProveImmutable {
	public static void main(String args[]) {
		String name="Vamshi";
		name.concat(" V");
		System.out.println(name);
		name=name.concat(" V");
		System.out.println(name);
	}
	
}
