
public class string {
    public static int isItPossible(String s) {
    // Concatenate s with itself to get s1
    String s1 = s + s;
    
    // Check if s1 is a concatenation of s with itself
    if (isConcatenation(s1)) {
        return 1;
    }
    
    // Check if s1 is a rotation of s
    String s2 = s1 + s1;
    for (int i = 0; i < s1.length(); i++) {
        if (s2.substring(i, i + s1.length()).equals(s1)) {
            return 1;
        }
    }
    
    return 0;
}



private static boolean isConcatenation(String s1) {
        return false;
    }



public static void main(String[] args) {
    String s = "abc";
    int result = isItPossible(s);
    System.out.println(result);
}
}
