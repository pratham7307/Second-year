package string;
import java.util.HashMap;
import java.util.Map;
public class frequencystring {
        public static void main(String[] args) {
        String abcd= "he was playing football";
        Map<Character,Integer>freqMap=new HashMap<>();
        for (char c:abcd.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer>entry:freqMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
