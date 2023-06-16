//15. Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//        "I live in Bangladesh"
//        Output:
//        Number of words: 4
//        Number of chars without spaces: 17
//        Number of consonant: 10
//        Number of vowels: 7

public class Count_Words_Characters_Vowel_Consonant {
    public static void main(String[] args) {
        String str = "I live in Bangladesh ";
        System.out.println("Given String: " + str);
        str = str.toLowerCase();
        char ch[] = str.toCharArray();
        int vowel = 0;
        int consonant = 0;
        for (char c : ch) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            } else if (c >= 'a' && c <= 'z') {
                consonant++;
            }
        }
        String splt[] = str.split(" ");
        System.out.println("Number of words: " + splt.length);

        int count = 0;
        for (int i = 0; i < splt.length; i++) {
            String word = splt[i];
            count += word.length();
        }
        System.out.println("Number of chars without spaces: " + count);
        System.out.println("Number of consonant: " + consonant);
        System.out.println("Number of vowels: " + vowel);

    }
}
