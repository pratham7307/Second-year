public class selectionsort {
    public static void main(String[] args) {
        int[] arr={5,4,8,6,2};
        int n=arr.length;
            for (int i=0;i<n;i++){
                int min=0;
                for(int j=i+1;j<n;j++){
                    if(arr[j]<arr[min]){
                       int temp=arr[i];
                       arr[i]=arr[min];
                       arr[min]=temp;
                    }
                }

            }for(int i:arr){
                System.out.println(i);
            }
    }
}
