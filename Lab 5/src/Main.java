import java.util.*;
public class Main{
   public static void main(String[] args){
       //Defining both arrays
       String[] firstArray;
       String[] secondArray;

       //Setting up 2 new WordGroups
       WordGroup firstGroup = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
       WordGroup secondGroup = new WordGroup("When you play play hard when you work dont play at all");

       //Set up word counts
       HashMap<String, Integer> firstWordCount;
       HashMap<String, Integer> secondWordCount;

       //making arrays from both WordGroups
       firstArray = firstGroup.getWordArray();
       secondArray = secondGroup.getWordArray();

       //Go through the arrays and print out the values stored
       System.out.println("First Array");
       for (int i = 0; i<firstArray.length; i=i+1){
           System.out.println(firstArray[i]);
       }
       System.out.println("");
       System.out.println("Second Array");
       for (int i = 0; i<secondArray.length; i=i+1){
           System.out.println(secondArray[i]);
       }

       //Make HashSet and add both WordGroups to it
       HashSet<String> hashSet = firstGroup.getWordSet(secondGroup);
       Iterator<String> iterator = hashSet.iterator();

       //Go through the HashSet and print out the values stored
       System.out.println("");
       System.out.println("Hash Set");
       for (int i=0; i<hashSet.size(); i++){
    	   System.out.println(iterator.next());
       }

       //Set up keysets
       Set<String> firstKeySet;
       Set<String> secondKeySet;

       //get word counts for both groups
       firstWordCount = firstGroup.getWordCounts();
       secondWordCount = secondGroup.getWordCounts();

       firstKeySet = firstWordCount.keySet();
       secondKeySet = secondWordCount.keySet();
       Iterator<String> firstIterator = firstKeySet.iterator();
       Iterator<String> secondIterator = secondKeySet.iterator();

       String a;
       System.out.println("");
       System.out.println("First Word Count");

       //prints out the word counts for both groups
       for(int i = 0; i<firstWordCount.size(); i++){
    	   a = firstIterator.next();
    	   System.out.println(firstWordCount.get(a) + " " + a);
       }
       System.out.println("");
       System.out.println("Second Word Count");
       for (int i = 0; i<secondWordCount.size(); i++){
    	   a = secondIterator.next();
    	   System.out.println(secondWordCount.get(a) + " " + a);
       }
       
       System.out.println("");
       System.out.println("Full Word Count");
       iterator = hashSet.iterator();

       //this is the full word count
       while (iterator.hasNext()){
    	   String key = iterator.next();
    	   int count = 0;
    	   if (firstGroup.getWordCounts().containsKey(key)){
    		   count = count + firstGroup.getWordCounts().get(key);
    	   }
    	   if (secondGroup.getWordCounts().containsKey(key)){
    		   count = count + secondGroup.getWordCounts().get(key);
    	   }
    	   System.out.println(key + " " + count);
       }
   }
}
