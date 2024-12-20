package Examples;

import java.util.ArrayList;
import java.util.Arrays;

public class VovelConsonant {
    public static void main(String[] args) {
        // vowel letter or consonant letter
        char letter = 'q';
        char[] vovelArrays = {'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü'};
        Boolean isVovel = false;
        for(char vovel : vovelArrays){
            if(letter == vovel){
                isVovel = true;
                break;
            }
        }

        if(isVovel){
            System.out.println(letter +" is Vowel letter");
        } else {
            System.out.println(letter +" is Consonant letter");
        }

        // using ArrayList
        ArrayList<Character> vovelsList = new ArrayList<>();
        vovelsList.add('a');
        vovelsList.add('e');
        vovelsList.add('ı');
        vovelsList.add('i');
        vovelsList.add('o');
        vovelsList.add('ö');
        vovelsList.add('u');
        vovelsList.add('ü');
        if (vovelsList.contains(letter)) {
            System.out.println(letter + " is Vowel letter");
        } else {
            System.out.println(letter + " is Consonant letter");
        }

        // using Arrays.binarySearch
        if(Arrays.binarySearch(vovelArrays, letter) < 0) {
            System.out.println(letter + " is Consonant letter");
        } else {
            System.out.println(letter + " is Vowel letter");
        }
    }
}
