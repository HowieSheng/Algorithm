package string;

public class ReverseString {
    
    // input "I am a hero"  
    // output "hero a am I"
    // input "ABC"  output "ABC"
    
    public static void reverseString(char[] input) {
        reverse(input, 0, input.length - 1);
        int start = 0, cur = 0;
        while(cur < input.length) {
            if (input[cur] != ' ') cur++;
            
            if (cur == input.length || input[cur] == ' ') {
                reverse(input, start, cur - 1);
                start = ++cur;
            }  
        }
        System.out.println(new String(input));
    }
    
    private static void reverse(char[] input, int start, int end) {
        while (start < end) {
            char temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        reverseString("".toCharArray());
        reverseString("     ".toCharArray());
        reverseString("A     ".toCharArray());
        reverseString("          A".toCharArray());
        reverseString("A    BV    V EV".toCharArray());
        reverseString("ABC".toCharArray());
    }
}
