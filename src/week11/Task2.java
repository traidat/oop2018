package week11;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    static <T extends Comparable<T>> void  maxOfArrayList(List <T> arr){
        T max = arr.get(0);
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i).compareTo(max) > 0) {
                max = arr.get(i);
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        List<Character> c = new ArrayList<Character>();
        List<Integer> i = new ArrayList<Integer>();
        List<Double> d = new ArrayList<Double>();
        List<Float> f = new ArrayList<Float>();
        List<Short> s = new ArrayList<Short>();
        List<Byte> b = new ArrayList<Byte>();
        List<Long> l = new ArrayList<Long>();
        c.add('h');
        c.add('v');
        c.add('A');
        i.add(1);
        i.add(19);
        i.add(100);
        i.add(11);
        d.add(-8.5);
        d.add(-5.0);
        d.add(-80.5);
        d.add(8.5);
        f.add(-8.5f);
        f.add(-5.0f);
        f.add(-80.5f);
        f.add(8.5f);
        s.add((short) 0);
        s.add((short) 19);
        s.add((short) 100);
        s.add((short) 11);
        b.add((byte) 33);
        b.add((byte) 3);
        b.add((byte) -33);
        b.add((byte) 0);
        l.add(1l);
        l.add(-1l);
        l.add(13l);
        l.add(-13l);
        maxOfArrayList(i);
        maxOfArrayList(d);
        maxOfArrayList(s);
        maxOfArrayList(l);
        maxOfArrayList(b);
        maxOfArrayList(c);
        maxOfArrayList(f);
    }
}
