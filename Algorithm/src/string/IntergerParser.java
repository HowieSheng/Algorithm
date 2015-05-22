package string;

public class IntergerParser {
    
    public static int parseInt(String s) throws Exception {
        if (s == null) throw new Exception("null");
        int i = 0, len = s.length();
        int result = 0;
        boolean negative = false;
        if (len > 0) {
           char firstChar = s.charAt(0);
           if (firstChar < '0') {
               if (firstChar == '-') {
                   negative = true;
               }
               else if (firstChar != '+') {
                   throw new Exception("invalid string of " + s);
               }
               if (len == 1) {
                   throw new Exception("invalid string of " + s);
               }
               i++;
           }
           
           while (i < len) {
               int digit = s.charAt(i++) - '0';
               if (digit < 0 || digit > 9) throw new Exception("invalid string of " + s);
               result *= 10;
               result += digit;
           }
           
        }
        
        return negative ? -result : result;
        
    }
    
    public static void main(String[] args) {
        try {
            System.out.println(parseInt("-23"));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(parseInt("-+"));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(parseInt("+23"));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(parseInt("abc"));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
