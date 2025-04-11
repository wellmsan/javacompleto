public class InsertionSort {
    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 2;
        array[1] = 3;
        array[2] = 5;
        array[3] = 1;
        array[4] = 4;

        for (int i = 1; i < array.length; i++) {
            int chave = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = chave;
        }

        for(int item : array) {
            System.out.println(item);
        }
    }
}
