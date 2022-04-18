package com.company.lesson9;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter string: ");
                String s = in.nextLine();

                //1)substring(first entry 'a', last entry 'b')
                int f = s.indexOf('a');
                int l = s.lastIndexOf('b');
                if( (f != -1) && (l != -1) ) {
                        String sub = s.substring(s.indexOf('a'), s.lastIndexOf('b'));
                        System.out.println(sub);
                }
                //2)replaceAll(pos(3), pos(0))
                if(s.length() > 3) {
                        System.out.println(s.replaceAll(String.valueOf(s.charAt(3)), String.valueOf(s.charAt(0)) ) );
                }
        }
}
