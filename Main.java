/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Defanging an IP address");

        Solution solution = new Solution();

        String address1 =  "1.1.1.1";
        String output_defanged1 = solution.defangIPaddr(address1);
        System.out.println("Count = " + output_defanged1);

        String address2 =  "255.100.50.0";
        String output_defanged2 = solution.defangIPaddr(address2);
        System.out.println("Count = " + output_defanged2);



    }
}
