package ArrayclassPractise;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {7,3,1,2,6,4};
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
            if (array[i]>array[j]) {
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            }
               }
                  }
    for(int i=0;i<array.length;i++)
    {
        System.out.println(array[i]+" ");
    }
           }
               }
