package as2;

import java.util.ArrayList;
import java.util.List;


public class dictionary {

    public wordInfo core;
    private int numEle;
    List<String> listWord;

    public dictionary() {
        core = null;
        numEle = 0;
        listWord = new ArrayList<>();
    }

    public int convert2Num(String item) {
        int val = 0, weight = 1;
        for (int x = 0; x < item.length(); x++) {
            val += weight * item.charAt(x);
            weight++;
        }
        return val;
    }

    public boolean add(String word, String meaning) {
        boolean jtf = true;
        wordInfo newWord = null;
        String toLower = word.toLowerCase();

        if (!search(toLower)) {
            newWord = new wordInfo(toLower, meaning);

            int tester = convert2Num(toLower);

            if (core == null) {
                core = newWord;
                listWord.add(toLower);
                numEle++;
                System.out.println(numEle);
                return jtf;
            }
            wordInfo parent, curr;
            parent = curr = core;
            while (curr != null) {
                parent = curr;
                if (tester < convert2Num(curr.getWord())) {
                    curr = curr.left;

                } else {
                    curr = curr.right;

                }
            }
            if (tester < convert2Num(parent.getWord())) {
                parent.left = newWord;
                listWord.add(toLower);
                numEle++;
                System.out.println(numEle);
                jtf = true;

            } else {
                parent.right = newWord;
                listWord.add(toLower);
                numEle++;
                System.out.println(numEle);
                jtf = true;

            }

        } else if (search(toLower)) {
            System.out.println("*** This word EXSISTED. Please! Enter OTHER word ***");
            jtf = false;
        }
        return jtf;
    }

    public boolean search(String word) {
        boolean jst = false;
        for (int x = 0; x < numEle; x++) {
            if (word.equals(listWord.get(x))) {
//                System.out.println("Exists");
                jst = true;
            } else if (!word.equals(listWord.get(x))) {
//                System.out.println("No Exists");
                jst = false;
            }
        }
        return jst;
    }

    public boolean exists(String word) {
        wordInfo curr = core;
        while (curr != null && curr.getWord() != word) {
            if (convert2Num(word) < convert2Num(curr.getWord())) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        if (curr != null) {
            System.out.println("Exists");
            return true;
        } else {
            System.out.println("No Exists");
            return false;
        }

    }

    public void printDictionary() {
        System.out.println("---- WORD LIST ----");
        producer(core);
        System.out.println("");
    }

    public void producer(wordInfo word) {
        if (word == null) {
            return;
        }
        producer(word.left);
        System.out.println(word.getWord());
        producer(word.right);
    }

    public boolean delete(String word) {
        
        if (searchWord2Delete(core, word) == null) {
            return false;
        } else {
            core = searchWord2Delete(core, word);
            return true;
        }
    }

    public wordInfo searchWord2Delete(wordInfo core, String word) {
        String toLower = word.toLowerCase();
        int tester = convert2Num(toLower);
        if (core == null) {
            return null;
        }
        if (tester < convert2Num(core.getWord())) {
            core.left = searchWord2Delete(core.left, toLower);
        } else if (tester > convert2Num(core.getWord())) {
            core.right = searchWord2Delete(core.right, toLower);
        } else {
            if (core.left == null) {
                return core.right;
            }
            if (core.right == null) {
                return core.left;
            }
            wordInfo succ = core.right;
            while (succ.left != null) {
                succ = succ.left;
            }
            core.word = succ.word;
            core.right = searchWord2Delete(core.right, succ.getWord());
        }
        return core;
    }
}
