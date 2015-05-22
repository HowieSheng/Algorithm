package algorithm.dynamic;

public class LCS {
    
    public static int[][] calulate(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int opt[][] = new int[len1 + 1][len2 + 1];
        
        for (int i = 0; i <= len1; i++) {
            opt[i][0] = 0;
        }
        
        for (int i = 0; i <= len2; i++) {
            opt[0][i] = 0;
        }
        
        for (int j = 1; j <= len2; j++) {
            for (int i = 1; i <=len1; i++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    opt[i][j] = opt[i-1][j-1] + 1;
                }
                else {
                    opt[i][j] = (opt[i-1][j] > opt[i][j-1] ? opt[i-1][j] : opt[i][j-1]); 
                }
            }
        }
        return opt;
    }
    
    public static void main(String[] args) {
        String str1 = "acdve";
        String str2 = "dvce";
        int[][] opt = calulate(str1, str2);
    }

}
