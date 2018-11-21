package week11;

public class Task1 {
    static <T extends Comparable<T>> void  sort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    T t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] i = {2,5,1,6,7};
        Double[] d = {3.4,5.6,7.8,9.0};
        Character[] c = {'a','t','b','A'};
        Long[] l = {-1l,99999l,898l,4l};
        Float[] f = {-1.3f, 6.7f, -999.6f,0f};
        Short[] s = {-8,6,2,3,9};
        Byte[] b = {6,9,7,0};
        sort(i);
        sort(d);
        sort(c);
        sort(l);
        sort(f);
        sort(s);
        sort(b);

    }
}
