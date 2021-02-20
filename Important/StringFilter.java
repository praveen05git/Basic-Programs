import java.util.*;

class StringFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String result = "";

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != '7') {
                if (s.charAt(i) == '5') {
                    if (s.charAt(i + 1) == '6') {
                        continue;
                    }
                } else {
                    result += s.charAt(i);
                }
            }
        }

        if (s.charAt(s.length() - 1) != '7') {
            result += s.charAt(s.length() - 1);
        }
        System.out.println(result);
    }
}