package com.dsa.august;

import java.util.List;
import java.util.stream.Collectors;

public class Mains {
    public static void main(String[] args) {
        /**
         *  String str ="Java is good programming language";
         * vowels in this sentence and replace them with vowels ascending order
         * 5=> a 
         * i => 2
         * o=> 3
         * str = Java as gaad pregrimming longoogu"
         */
        String str ="Java is good programming language";
        String result = convertString(str);
        System.out.println("Output String ::"+result);

    }

        public static String convertString(String str){
            List<Character> vowel = str.chars()
                                    .mapToObj(op -> (char) op)
                                    .filter(Mains::isVowel)
                                    .sorted().collect(Collectors.toList());

        System.out.println("Output vowel ::"+vowel);
        //Replacing the vowels in input string 
            StringBuilder output = new StringBuilder();
            int vowelCounts =0;
            for(char ch : str.toCharArray()){
                if(isVowel(ch)){
                    output.append(vowel.get(vowelCounts++));
                } else {
                    output.append(ch);
                }
            }

            return output.toString();
        }

        static boolean isVowel (char ch){
            //To convert the string in lower case
            ch = Character.toLowerCase(ch);
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ;
        } 
}
