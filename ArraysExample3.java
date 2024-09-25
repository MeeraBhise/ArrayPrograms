package ArrayclassPractise;

public class ArraysExample3 {
    public static void main(String[] args) {
     int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
      int[] dummy =new int[31];
      int sum=0;
      for(int i=2;i<arr.length;i++)
      {
          sum=sum+arr[i];
      }
        System.out.println(sum);
    }
}
