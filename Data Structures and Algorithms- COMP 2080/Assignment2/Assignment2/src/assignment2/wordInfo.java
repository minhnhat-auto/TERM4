package assignment2;


public class wordInfo {

    public String word;
    public String meaning;
    wordInfo left, right;

    public wordInfo(String word, String meaning) {
        this.word = word.toLowerCase();
        this.meaning = meaning;
        left = right = null;

    }

    public String getWord() {
        return word;
    }

    
}
