import java.util.Arrays;
import java.util.Comparator;

public class DeckProblem {

    private int[] reorder(Integer[] arr) {

        Arrays.sort(arr, Comparator.reverseOrder());

        int[] result_array = new int[arr.length];
        int rear = result_array.length - 1;

        int point = (arr.length % 2 == 0) ?  arr.length - 2 : arr.length - 1 ;

        for(int i = result_array.length / 2 ; i < result_array.length ; i++){

            result_array[point] = arr[i];
            arr[i] = 0;
            point = point - 2;
            rear = rear - 1;
        }

        int i = 0;
        point = (result_array.length % 2 == 0) ? arr.length - 1 : arr.length - 2;

        while(arr[i] != 0){

            if (i % 2 == 0) {
                result_array[point] = arr[i];
                point = point - 2;
            }

            else {
                arr[++rear] = arr[i];
                }

            i++;

        }

        return result_array;

    }


    public static void main(String[] args) {

        Integer[] arr = {1,3,4,2};
        Deck d = new Deck();
        int[] arr1 = d.reorder(arr);

        System.out.println(Arrays.toString(arr1));
    }
}
