import java.text.ParseException;


public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println(CountNumebrs("01234safd"));
    }

    public static int CountNumebrs(String string) {
        int count = 0;
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c)) count++;
        }
        return count;
    }


}