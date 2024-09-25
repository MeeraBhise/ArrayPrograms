package ArrayclassPractise;

public class arraysumofallelements {
    public static void main(String[] args) {
        int[] array = {20, 10, 90, 66, 15, 44, 22};
        //0 + 2
        //20 90 15 22
        //
        //output =
        //loop
        //sum
        int sum = 0;
        for(int i = 0; i < array.length; i = i + 2){
            sum =  sum + array[i];
        }

        System.out.println("Addition is "+sum);

       /* int sum1 = 0;
        for(int i = 1; i < array.length; i = i + 2){
            sum1 =  sum1 + array[i];
        }

        System.out.println("Addition is "+sum1);
    }*/
    }

}
