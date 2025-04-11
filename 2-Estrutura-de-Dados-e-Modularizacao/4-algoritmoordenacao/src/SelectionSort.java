public class SelectionSort {
    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 2;
        array[1] = 3;
        array[2] = 5;
        array[3] = 1;
        array[4] = 4;

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        for(int item : array) {
            System.out.println(item);
        }
    }
}
