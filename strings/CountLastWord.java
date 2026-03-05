package strings;

public class CountLastWord {
    public static void main(String[] args) {
        String sentence = "Hello World";
        int count = countLastWord(sentence);
        System.out.println("The number of characters in the last word is: " + count);
    }

    static int countLastWord(String sentence) {
        String[] words = sentence.split(" ");
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }

    
}
