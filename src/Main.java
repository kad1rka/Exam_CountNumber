import java.text.ParseException;


public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println(CountNumebrs("01234safd"));
    }
    public static int CountNumebrs(String string) {
        int count = 0;
        for (int i = 0; i <  string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) count++;
        }
        return count;
    }


}