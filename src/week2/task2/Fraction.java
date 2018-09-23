package week2.task2;

public class Fraction {

    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static int gcd(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        if (absA == absB) {
            return absA;
        } else if (absA > absB) return gcd(absA - absB, absB);
        else return gcd(absB - absA, absA);
    }

    public Fraction add(Fraction other) {
        Fraction result = new Fraction(0, 0);
        int ucln = gcd(this.denominator, other.denominator);
        result.denominator = this.denominator * other.denominator / ucln;
        result.numerator = this.numerator * other.denominator / ucln + other.numerator * this.denominator / ucln;
        int uclnResult = gcd(result.denominator, result.numerator);
        result.denominator = result.denominator / uclnResult;
        result.numerator = result.numerator / uclnResult;
        return result;
    }

    public Fraction subtract(Fraction other) {
        Fraction result = new Fraction(0, 0);
        int ucln = gcd(this.denominator, other.denominator);
        result.denominator = this.denominator * other.denominator / ucln;
        result.numerator = this.numerator * other.denominator / ucln - other.numerator * this.denominator / ucln;
        int uclnResult = gcd(result.denominator, result.numerator);
        result.denominator = result.denominator / uclnResult;
        result.numerator = result.numerator / uclnResult;
        return result;
    }

    public Fraction multiply(Fraction other) {
        Fraction result = new Fraction(0, 0);
        result.denominator = this.denominator * other.denominator;
        result.numerator = this.numerator * other.numerator;
        int uclnResult = gcd(result.denominator, result.numerator);
        result.denominator = result.denominator / uclnResult;
        result.numerator = result.numerator / uclnResult;
        return result;

    }

    public Fraction divide(Fraction other) {
        Fraction result = new Fraction(0, 0);
        result.denominator = this.denominator * other.numerator;
        result.numerator = this.numerator * other.denominator;
        int uclnResult = gcd(result.denominator, result.numerator);
        result.denominator = result.denominator / uclnResult;
        result.numerator = result.numerator / uclnResult;
        return result;
    }
    public boolean equals(Object obj)

    public static void main(String[] args) {
        Fraction pso = new Fraction(-1, 3);
        Fraction ps = new Fraction(1, 6);
        System.out.println(pso.add(ps).numerator + "/" + pso.add(ps).denominator);
        System.out.println(pso.subtract(ps).numerator + "/" + pso.subtract(ps).denominator);
        System.out.println(pso.multiply(ps).numerator + "/" + pso.multiply(ps).denominator);
        System.out.println(pso.divide(ps).numerator + "/" + pso.divide(ps).denominator);
    }
}

