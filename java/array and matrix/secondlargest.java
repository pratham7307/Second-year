public class secondlargest {
    public static void main(String args[]){
        int[] number={2,4,3,5,6,8,7,1,9} ;
        System.out.println(findsecond_largest(number));
    }
    public static int findsecond_largest(int[] arr){
        if(arr.length<2){
            System.out.println("error");
            return Integer.MIN_VALUE;
        }
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second_max=max;
                max=arr[i];
            }else if(arr[i]>second_max && arr[i]!=max){
                second_max=arr[i];
            }
        } if(second_max == Integer.MIN_VALUE){
            System.out.println("No second largest element found");
            return Integer.MIN_VALUE; // or throw exception
        }
        return second_max;
    }}