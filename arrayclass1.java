package ArrayclassPractise;

public class arrayclass1 {
    public static void main(String[] args) {
        double[] doubles = {12,5,5,8,9,12,23,65,45};  //create an array with values
        System.out.println("doubles array size is "+doubles.length);  //9
        System.out.println(doubles[7]);  //65

        double[] newArray = new double[10];  //create an Array and specify the size of an array
        System.out.println("newArray array size is "+newArray.length);  //10
        newArray[0] = 100;
        newArray[5] = 900;
        System.out.println("newArray element  value is "+newArray[0]);  //
        System.out.println("newArray element  value is "+newArray[5]);  //
        // 0 to  19

        //newArray[20] = 1000
    }
}
