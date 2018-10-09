//package week3;
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class Week3Test {
//
//    @Test
//    public void testMax1(){
//        assertEquals(0, Week3.max(0,-4));
//    }
//    @Test
//    public void testMax2() {
//        assertEquals(10, Week3.max(10, 10));
//    }
//
//    @Test
//    public void testMax3() {
//        assertEquals(5, Week3.max(4,5));
//    }
//    @Test
//    public void testMax4() {
//        assertEquals(1555, Week3.max(0,1555));
//
//    }
//    @Test
//    public void testMax5() {
//        assertEquals(120, Week3.max(120,-120));
//
//    }
//
//    @Test
//    public  void testMinOfArray1() {
//        int[] arr1 = {1, 2, 5, 6, 7};
//        assertEquals(1, Week3.minOfArray(arr1));
//
//    }
//    @Test
//    public  void testMinOfArray2() {
//        int[] arr2 = {0};
//        assertEquals(0, Week3.minOfArray(arr2));
//    }
//
//    @Test
//    public  void testMinOfArray3() {
//        int[] arr3 = {1, 2, 5, 6, 7, 8, -1, -6, 0};
//        assertEquals(-6, Week3.minOfArray(arr3));
//    }
//
//    @Test
//    public  void testMinOfArray4() {
//        int[] arr4 = {1, 1};
//        assertEquals(1, Week3.minOfArray(arr4));
//    }
//
//    @Test
//    public  void testMinOfArray5() {
//        int[] arr5 = {1, 2, 5, 6, 7, 1292, -12213, 0, 51212};
//        assertEquals(-12213, Week3.minOfArray(arr5));
//    }
//    @Test
//    public void testCalculateBMI1() {
//        assertEquals("Thieu can", Week3.calculateBMI(33.75,1.5));
//    }
//
//    @Test
//    public void testCalculateBMI2() {
//        assertEquals("Binh thuong", Week3.calculateBMI(51.2, 1.6));
//    }
//
//    @Test
//    public void testCalculateBMI3() {
//        assertEquals("Thua can", Week3.calculateBMI(69.36,1.7));
//    }
//
//    @Test
//    public void testCalculateBMI4() {
//        assertEquals("Beo phi", Week3.calculateBMI(97.2,1.8));
//    }
//
//    @Test
//    public void testCalculateBMI5() {
//        assertEquals("Thieu can", Week3.calculateBMI(61.37,1.9));
//    }
//
//}
