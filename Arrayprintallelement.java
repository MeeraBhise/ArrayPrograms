package ArrayclassPractise;

public class Arrayprintallelement {
    public static void main(String[] args) {
        int[] arr = {21,11,7,3,12,44,66,13,90};

        int[] dummy = new int[9];

        for(int i = 0; i < arr.length;i++){
            System.out.println("Value in given arr at index "+arr[i]);
        }

        int sum = 0;

        for(int i = 0; i < arr.length;i++){
            //21
            sum  = sum + arr[i];
            System.out.println(sum);
            //System.out.println("Value in given arr at index "+arr[i]);
        }
        System.out.println("Addition of all vales in given array is "+sum);

    }
}

