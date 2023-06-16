//19. Extract the OTP from the SMS.
//        "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S"

public class Extract_the_OTP_from_SMS {
    public static void main(String args[]) {
        String str = "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S";
        String password = str.replaceAll("[^0-9]", "").substring(0, 6);
        System.out.println(password);

    }
}
