package com.company.lesson12;

import java.io.*;
import java.util.HashSet;

public class FileHandler implements Serializable {

        private static final long SerialVersionUID = 10l;

        public static class TextFormater {

                public static int countWords(String sentence) {

                        String[] words = sentence.split("[^A-Za-zА-яа-я]+");
                        return words.length;
                }

                private static boolean isPalindrome(String s) {

                        StringBuilder sb = new StringBuilder(s);
                        return (s.equals(sb.reverse().toString()) && s.length() > 1);
                }

                public static boolean hasPalindrome(String sentence) {

                        String[] words = sentence.split("[^A-Za-zА-яа-я]+");
                        for(String w : words) {
                                if(isPalindrome(w)) {
                                        return true;
                                }
                        }
                        return false;
                }
        }


        public static void createFile(String fileName) throws IOException {

                File file = new File(fileName);

                if(!file.exists()) {
                        file.createNewFile();
                }

        }

        private static String[] sentencesFromText(String fileName) throws IOException {

                BufferedReader bf = new BufferedReader(new FileReader(fileName));

                int c;
                StringBuilder Text = new StringBuilder();
                while((c = bf.read()) != -1) {

                        if((char)c == '.' || (char)c == '?' || (char)c == '!') {
                                Text.append('\n');
                                continue;
                        }

                        if((char)c != '\n') {
                                Text.append((char) c);
                        }
                }

                bf.close();

                return Text.toString().split("\\n");
        }

        public static void suitableSentence(String fileName) throws IOException {

                if(!(new File(fileName).exists())) {
                        System.out.println("Not such file");
                        return;
                }

                BufferedWriter bw = new BufferedWriter(new FileWriter("ThreeFivePalindromesSent"));

                String[] sentences = FileHandler.sentencesFromText(fileName);

                for(String s : sentences) {

                        if( (TextFormater.countWords(s) >= 3 && TextFormater.countWords(s) <= 5)
                                || (TextFormater.hasPalindrome(s)) ) {

                                bw.write(s.strip() + "\n");
                        }
                }


                bw.close();
        }

        public static void checkBlackList(String fileName, String BlackListFile) throws IOException {

                if(!(new File(fileName).exists()) && !(new File(BlackListFile).exists())) {
                        System.out.println("Not such file(s)");
                        return;
                }

                BufferedReader bf = new BufferedReader(new FileReader(fileName));
                BufferedReader blackListbuffer = new BufferedReader(new FileReader(BlackListFile));

                HashSet<String> blackList = new HashSet<>();
                String word;

                while((word = blackListbuffer.readLine()) != null) {
                        blackList.add(word);
                }

                int badSentencesCounter = 0;
                String[] sentences = FileHandler.sentencesFromText(fileName);

                System.out.println("Bad sentences:");
                for(String s : sentences) {

                        String[] words = s.split("[^A-Za-zА-яа-я]+");

                        for(String w : words) {
                                if(blackList.contains(w)) {
                                        badSentencesCounter++;
                                        System.out.println(s.strip());
                                }
                        }
                }

                System.out.println("In total: " + badSentencesCounter);
                bf.close();
                blackListbuffer.close();
        }

        public static void findPalindromes(String fileName) throws IOException {

                if(!(new File(fileName).exists())) {
                        System.out.println("Not such file");
                        return;
                }

                String word;

                BufferedReader bf = new BufferedReader(new FileReader(fileName));
                BufferedWriter bw = new BufferedWriter(new FileWriter("PalindromeFile"));

                while( (word = bf.readLine()) != null ) {
                        if(FileHandler.TextFormater.isPalindrome(word)) {
                                bw.write(word + '\n');
                        }
                }

                bf.close();
                bw.close();
        }

}
