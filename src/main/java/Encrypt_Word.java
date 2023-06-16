//16. Encrypt word: ROADTOSDET [when A=F]
//        Output: WTFIYTXIJY

public class Encrypt_Word {
    static void enCrypt(String st) {
        char[] ch = st.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'R') {
                ch[i] = 'W';
            } else if (ch[i] == 'A') {
                ch[i] = 'F';
            } else if (ch[i] == 'D') {
                ch[i] = 'I';
            } else if (ch[i] == 'T') {
                ch[i] = 'Y';
            } else if (ch[i] == 'O') {
                ch[i] = 'T';
            } else if (ch[i] == 'S') {
                ch[i] = 'X';
            } else if (ch[i] == 'E') {
                ch[i] = 'J';
            }
        }
        for (char el : ch) {
            System.out.print(el);
        }
    }

    public static void main(String args[]) {
        String st = "ROADTOSDET";
        System.out.println("Given word: " + st);
        System.out.print("\nEncrypted:");
        enCrypt(st);
    }
}
