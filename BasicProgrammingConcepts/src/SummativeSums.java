import java.util.Arrays;

public class SummativeSums {
    public static void main(String[] args) {
        int[] array = { 999, -60, -77, 14, 160, 301 };
        sumArray(array); // how to get it as just {...} as the input
    }


    public static void sumArray (int[] array){
        int sum =0;

        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }

        System.out.println(sum);
    }
}
