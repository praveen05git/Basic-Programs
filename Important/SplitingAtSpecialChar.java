//Spliting at special character and reversing it

import java.util.*;

public class SplitingAtSpecialChar {
    public static void main(String[] args) {

        String str = "hello.world";

        String[] s = str.split("[, ?.@]+");
        // str.split("[.]");
        // str.split("[@]"); is also working within []

        String result = "";

        for (int i = s.length - 1; i >= 0; i--) {
            if (i == 0)
                result = result + s[i];
            else
                result = result + s[i] + ".";
        }

        System.out.println(result);
    }
}

/*
OUTPUT:
world.hello
*/
