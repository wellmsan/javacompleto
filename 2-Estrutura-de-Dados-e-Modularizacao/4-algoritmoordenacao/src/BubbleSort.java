import java.util.ArrayList;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 2;
        array[1] = 3;
        array[2] = 5;
        array[3] = 1;
        array[4] = 4;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for(int item : array) {
            System.out.println(item);
        }

    }
}
