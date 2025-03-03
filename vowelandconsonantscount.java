package defualt1;

public class vowelandconsonantscount {
	public static void main(String[] args) {
        String input = "Hello World!";
        int vowelsCount = 0;
        int consonantsCount = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        System.out.println("Vowels count: " + vowelsCount);
        System.out.println("Consonants count: " + consonantsCount);
    }
}
