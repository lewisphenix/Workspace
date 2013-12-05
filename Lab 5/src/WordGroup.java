import java.util.*;
public class WordGroup{
    String words;
    
    public WordGroup(String upWord){ //Converts the wordgroup to lowercase
        words = upWord.toLowerCase();
    }

    public String[] getWordArray(){ //Creates an array
        return words.split(" ");
    }
            
    public HashSet<String> getWordSet(WordGroup wGroup){ //Creates a hashset with both wordgroups
        HashSet<String> wordSet = new HashSet<String>();
        for (int i=0; i<this.getWordArray().length; i++){ //adding the first wordgroup
        	wordSet.add(this.getWordArray()[i]);
        }
        for (int i=0; i<wGroup.getWordArray().length; i++){ //adding the second wordgroup
        	wordSet.add(wGroup.getWordArray()[i]);
        }
        return wordSet;
    }
    
    public HashMap<String, Integer>  getWordCounts(){ //Creates a hashmap from the wordgroup and gives the word count
    	HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
    	for (int i=0; i<this.getWordArray().length; i++){
    		if (hashMap.containsKey(this.getWordArray()[i]) == true){
    			hashMap.put(this.getWordArray()[i], hashMap.get(this.getWordArray()[i]) + 1);
    		}
    		else{
    			hashMap.put(this.getWordArray()[i], 1);
    		}
    	}
    	return hashMap;
    }
}
