package string;

public class longestword {
    public static void main(String[] args) {
        String sentence="find the longest word in the sentence";
        String[] words=sentence.split("\\s+");
        String longestword="";
        for(String word:words){
            if(word.length()>longestword.length()){
                longestword=word;
            }
        }
        System.out.println(longestword);
    }
}
