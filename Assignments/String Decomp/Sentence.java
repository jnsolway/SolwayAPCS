import java.util.*;

public class Sentence {
    public static String Sentence = "do?";

    public static void main(String[] args) {
        ArrayList<Character> sentenceList = new ArrayList<Character>();
        for(int i = 0; i < Sentence.length(); i++) {
            char c = Sentence.charAt(i);
            sentenceList.add(c);
        }
        System.out.println(getBlankPositions());
        System.out.println(countWords());
        System.out.println(Arrays.toString(getWords()));
    }

    public static List<Integer> getBlankPositions(){
        ArrayList<Integer> blankList = new ArrayList<Integer>();
        for(int i = 0; i < Sentence.length(); i++) {  
            if(Sentence.charAt(i) == ' ') {
                blankList.add(i);
            }
        }
        return blankList;
    }
    public static int countWords(){
        int x = 0;
        for(int i = 0; i < Sentence.length(); i++) {  
            if(Sentence.charAt(i) == ' ' || Sentence.charAt(i) == '.' || Sentence.charAt(i) == '!' || Sentence.charAt(i) == '?') {
                x++;
            }
        }
        return x;
    }
    public static String[] getWords(){
        int count = countWords();
        String[] wordList = new String[count];
        List<Integer> spaceList = getBlankPositions();
        int x = 0;
        int y = 0;
        int z = 0;
        String word = "";
            for(int i = 0; i < spaceList.size(); i++ ) {
                y = spaceList.get(i);
                for(int j = z ; j < y; j++){
                    word = word + Sentence.charAt(j);
                    
                }
                wordList[i] = word;
                word = "";
                z = y+1;
            }
            for(int i = z; i < Sentence.length(); i++ ) {
                word = word + Sentence.charAt(i);
                
            }
            wordList[count - 1] = word;
            word = "";
            return wordList;
        }
       
}