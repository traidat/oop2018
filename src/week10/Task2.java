package week10;

public class Task2 {
    public static void main(String[] args) {
        double[] array = new double[1000];

        for (int i = 0; i < 1000; i++) {
            array[i] = Math.random();
        }
        for (int i = 999; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(array[i]);
        }
    }
}
