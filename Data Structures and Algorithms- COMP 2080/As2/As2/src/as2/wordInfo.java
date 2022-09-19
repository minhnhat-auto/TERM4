
package as2;

public class wordInfo {
    public String word;
    private String meaning;
    wordInfo left, right;
    
    
    public wordInfo(String word, String meaning){
        this.word = word.toLowerCase();
        this.meaning = meaning;
        left = right = null;
    }
    
//    public wordInfo(String word){
//        this.word = word;
//        meaning = meaning;
//        left = right = null;
//    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
    
    
}
