import java.util.HashMap;
import java.util.Map;

/**
 * @author Aayush Manandhar
 */
public class WordCounter {
    private final Map<String,Integer> wordMap = new HashMap<>();


    //Function that takes a String parameter to addword to the wordMap object
    public void addWord(String word) {

        if (wordMap.containsKey(word)) {
            int occurrences = wordMap.get(word);
            wordMap.put(word, occurrences + 1);
        } else {
            wordMap.put(word, 1);
        }
    }

    //Function that takes a String parameter and adds words to an array when " " is encountered.
    public void addSentence(String sentence){
        String [] words = sentence.split(" ");
        for (String w: words) {
            addWord(w);
        }
    }

    //Function to print the outputResult
    public void outputResults() {
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " - Occurrences: " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        wordCounter.addSentence("I wonder if this is working");
        wordCounter.addSentence("Yes it is working");
        wordCounter.outputResults();
    }
}
