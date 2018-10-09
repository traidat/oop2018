//package week2.task1;
//
//public class Task1 {
//
//    public static int gcd(int a, int b) {
//        int absA = Math.abs(a);
//        int absB = Math.abs(b);
//        if (absA == absB) {
//            return absA;
//        }
//        else if (absA > absB) return gcd(absA - absB, absB);
//        else return gcd(absB - absA, absA);
//    }
//
//    public static int fibonacci(int n) {
//        if (n == 1)
//            return 1;
//        else if (n == 0)
//            return 0;
//        else return fibonacci(n - 1) + fibonacci(n - 2);
//    }
//    public static void main(String[] args) {
//        System.out.println( gcd(-9,18));
//        System.out.println(fibonacci(5));
//    }
//}
