public class largestandsmallest{
    public static void main(String[] args) {
        int[] number={2,4,3,5,6,8,7,1} ;
        int max=number[0];
        int min=number[0];
        for(int c:number){
            if(c>max){
                max=c;
            }
            if(c<min){
                min=c;
            }
        }
        System.out.println(max);
        System.out.println(min);   
    }
}