import java.util.HashMap;
import java.util.Map;

public class frequencyarray {
    public static void main(String[] args) {
    int[] arr={2,2,4,5,5,6,8,8};
        Map<Integer,Integer>freqMap=new HashMap<>();
        for (int c:arr){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Integer,Integer>entry:freqMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
