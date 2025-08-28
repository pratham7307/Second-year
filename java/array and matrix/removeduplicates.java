import java.util.LinkedHashSet;
public class removeduplicates {
    public static void main(String[] args) {
        
        int[] arr={2,2,4,5,5,6,8,8};
        LinkedHashSet<Integer> seen = new LinkedHashSet<>();

        for (int i:arr) {
            if (!seen.contains(i)) {
                seen.add(i);
            }
        }
       for(int i:seen){
        System.out.println(i);
       }
    }}

