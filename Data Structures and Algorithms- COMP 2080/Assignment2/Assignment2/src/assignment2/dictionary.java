package assignment2;

public class dictionary {

    public wordInfo core;
    private int numEle;

    public dictionary() {
        core = null;
        numEle = 0;
    }

    public boolean add(String word, String mean) {
        boolean val = true;
        wordInfo newWord = null;
        //Test duplicate
        if (!search2Test(word)) {

            newWord = new wordInfo(word, mean);

            // Case1 empty
            if (core == null) {
                core = newWord;
                numEle++;
                return val;
            }

            //Case2 leaves
            wordInfo explorer, follower;
            explorer = follower = core;
            while (explorer != null) {
                follower = explorer;
                if (explorer.word.compareToIgnoreCase(word) > 0) {
                    explorer = explorer.left;
                } else {
                    explorer = explorer.right;
                }
            }
            if (follower.word.compareToIgnoreCase(word) > 0) {
                follower.left = newWord;
                numEle++;
                val = true;
            } else {
                follower.right = newWord;
                numEle++;
                val = true;
            }

        } else if (search2Test(word)) {
            System.out.println("*** This word EXSISTED. Please! Enter OTHER word ***");
            val = false;
        }

        return val;
    }

    public boolean exists(String word) {
        boolean val = true;
        wordInfo explorer = core;

        //Case1 empty 
        if (explorer == null) {
            System.out.println("Binary Tree EMPTY!!!");
            return false;
        }
        //Case2 leaves
        while (explorer != null && !explorer.word.equals(word)) {
            if (explorer.word.compareToIgnoreCase(word) > 0) {
                explorer = explorer.left;
            } else {
                explorer = explorer.right;
            }
        }

        if (explorer != null) {
            System.out.println("SUCCESSFULLY FOUND: " + explorer.word);
            val = true;
        } else {
            System.out.println("***NOT FOUND the WORD***");
            val = false;
        }
        return val;
    }

    public boolean search2Test(String word) {
        boolean val = true;
        wordInfo explorer = core;

        //Case1 empty 
        if (explorer == null) {
//            System.out.println("Binary Tree EMPTY!!!");
            return false;
        }
        //Case2 leaves
        while (explorer != null && !explorer.word.equals(word)) {
            if (explorer.word.compareToIgnoreCase(word) > 0) {
                explorer = explorer.left;
            } else {
                explorer = explorer.right;
            }
        }

        if (explorer != null) {
            //System.out.println(" Successfully FOUND: " + explorer.word);
            val = true;
        } else {
            //System.out.println("Not FOUND the WORD!!!");
            val = false;
        }
        return val;

    }

    public String search(String word) {
        String val = null;
        wordInfo explorer = core;

        //Case1 empty 
        if (explorer == null) {
//            System.out.println("Binary Tree EMPTY!!!");
            return val;
        }
        //Case2 leaves
        while (explorer != null && !explorer.word.equals(word)) {
            if (explorer.word.compareToIgnoreCase(word) > 0) {
                explorer = explorer.left;
            } else {
                explorer = explorer.right;
            }
        }

        if (explorer != null) {
            //System.out.println(" Successfully FOUND: " + explorer.word);
            val = explorer.meaning;
        } else {
            //System.out.println("Not FOUND the WORD!!!");
            val = null;
        }
        return val;

    }
    
    public String search2(String word) {
        String val = null;
        wordInfo explorer = core;

        //Case1 empty 
        if (explorer == null) {
//            System.out.println("Binary Tree EMPTY!!!");
            return val;
        }
        //Case2 leaves
        while (explorer != null && !explorer.word.equals(word)) {
            if (explorer.word.compareToIgnoreCase(word) > 0) {
                explorer = explorer.left;
            } else {
                explorer = explorer.right;
            }
        }

        if (explorer != null) {
            //System.out.println(" Successfully FOUND: " + explorer.word);
            val = explorer.word;
        } else {
            //System.out.println("Not FOUND the WORD!!!");
            val = null;
        }
        return val;

    }

    public boolean delete(String word) {
        if (!search2Test(word)) {
            System.out.println("");
            System.out.println("CANNOT Delete!!!");
            return false;
        }
        core = recursiveDelete(core, word);
        System.out.println("\nDeleted SUCCESSFULLY");
        return true;
    }

    private wordInfo recursiveDelete(wordInfo core, String word) {
        //Case1 empty
        if (core == null) {
            return null;
        }
        //Case2 leaves
        if (core.word.compareToIgnoreCase(word) > 0) {
            core.left = recursiveDelete(core.left, word);
        } else if (core.word.compareToIgnoreCase(word) < 0) {
            core.right = recursiveDelete(core.right, word);
        } else if (core.word.compareToIgnoreCase(word) == 0) {
            if (core.left == null) {
                return core.right;
            } else if (core.right == null) {
                return core.left;
            } //else if (core.right != null && core.left != null) 

            //Case3
            wordInfo receiver = core.right;
            while (receiver.left != null) {
                receiver = receiver.left;
            }
            core.word = receiver.word;
            core.right = recursiveDelete(core.right, receiver.word);
        }
        return core;
    }

    public String getMeaning(String word) {
        String holder = null;
        String searcher = search(word);
//        if (core == null) {
//            return holder;
//        }
        if (searcher != null) {
            holder = searcher;
        } else {
            holder = null;
        }
        return holder;
    }

    public int getCount() {
        return numEle;
    }

    public void printDictionary() {
        System.out.println("\n---- DICTIONARY ----");
        producer(core);
        System.out.println("");
    }

    private void producer(wordInfo word) {
        if (word == null) {
            return;
        }
        producer(word.left);
        System.out.println(word.word + " - " + word.meaning);
        producer(word.right);
    }

    public String printWordList() {
        System.out.println("\n---- WORD LIST ----");
        return producer2(core);
    }

    private String producer2(wordInfo word) {
        String res = "";
        if (word != null) {
            res += producer2(word.left);
            res += word.word + "\n";
            res += producer2(word.right);
        }
        return res;

    }

    
}
