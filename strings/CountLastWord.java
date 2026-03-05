package strings;

public class CountLastWord {
    public static void main(String[] args) {
        String sentence = "Hello World";
        String sentence2="My name is Piyush";
        int count = countLastWord(sentence);
        System.out.println("The number of characters in the last word is: " + count);
         int count2=countLastWord2(sentence2);
        System.out.println("The number of characters in the last word is: " + count2);
    }
    

    static int countLastWord(String sentence) {
        String[] words = sentence.split(" ");
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }

    static int countLastWord2(String sentence){
        int last = sentence.length()-1;
        int count =0;
        while (last>=0  && sentence.charAt(last)==' '){
            last--;
        }
        while (last>=0  && sentence.charAt(last)!=' '){
            count++;
            last--;
        }   
        return count;
    }
}
