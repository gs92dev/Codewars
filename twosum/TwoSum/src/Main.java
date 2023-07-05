import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int[] twoSum(int[] numbers, int target) {
        System.out.println(Arrays.toString(numbers));
        //Pick to 2 and use an loop to interate numbers

        for (int i = 0; i<numbers.length; i++ ){

            int num1 = numbers[i];
            for (int j = 1; j<numbers.length; j++){
                int num2 = numbers[j];
                int sum = num1+num2;
                if(sum == target){

                    int [] index = {i,j} ;

                    System.out.println(Arrays.toString(index));
                    return index ;

                }
            }




        }
        return null; // Do your magic!
    }
    public static void main(String[] args) {


        int[] numbers = {1,2,3};
        int target = 4;
        twoSum(numbers,target);

    }
}