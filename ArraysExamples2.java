package ArrayclassPractise;

public class ArraysExamples2 {
    public static void main(String[] args) {
        int[] array={10,10,10,10,10,10,10,10};
        int sum=0;
        for(int i=0;i<array.length;i=i+5)
        {
            sum=sum+array[i];
        }
        System.out.println(sum);
    }
}
