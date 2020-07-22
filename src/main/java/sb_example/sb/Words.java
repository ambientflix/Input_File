package sb_example.sb;

import java.util.ArrayList;
import java.util.List;

public class Words {
    //String arraylist
    private List<String> keywords = new ArrayList<String>();
    private int weight;

    public Words() {
        weight = 0;

    }

    public List<String> getkeywords() {
        return keywords;
    }

    public void setKeywords(List<String> value) {
        this.keywords = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int value) {
        weight = value;
    }

    public void addWords(String words) {
        keywords.add(words);
    }

    public void printWords() {
        for (String name : keywords) {
            System.out.println(name);
        }
    }

}
//get()
//set()

//getting the words.
//need to fix file, in order to determine the type of data. Possibly asking them to group their text files.
//ask them to provide three demo files and combine them and run them in a way that works.
//Possibly might split up files?