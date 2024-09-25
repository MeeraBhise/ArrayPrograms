package ArrayclassPractise;

public class arrayelementinreverseorder {
    public static void main(String[] args) {

        String s = "Java";
        String s1 = "Programming";
        //s = "Programming";
        //s1 = "Java";
        s= s+s1;
        //s1 = s.substring()



        int[] arr = {21,11,7,3,12,44,66,13,90};
        //3 7 11 12 13 21 44 66 90
        //System.out.println("All values in given array "+arr[]);  //
        for(int i = 0; i <= arr.length - 1; i++){
            // 8  90
            // 7  13
            // 6  66
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");
        //for loop
        //i = length-1; i >= 0; i--
        //length = 9    0 8
        // 21 11 7  3 12 44 66 13 90
        // 0  1  2  3  4  5  6  7  8
        for(int i = arr.length - 1; i >= 0; i--){
            // 8  90
            // 7  13
            // 6  66
            System.out.print(arr[i] + " ");
        }
    }
}

