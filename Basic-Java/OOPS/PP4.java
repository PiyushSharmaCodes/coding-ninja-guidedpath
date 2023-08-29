import java.util.*;

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void add(Fraction f) {
        this.numerator = this.numerator * f.denominator + f.numerator * this.denominator;
        this.denominator *= f.denominator;
        simplify();
    }

    public void multiply(Fraction f) {
        this.numerator *= f.numerator;
        this.denominator *= f.denominator;
        simplify();
    }

    private void simplify() {
        int gcd = gcd(numerator, denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }


    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public void display() {
        System.out.println(numerator + "/" + denominator);
    }
}

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();
        Fraction f1 = new Fraction(numerator, denominator);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int num = sc.nextInt();
            int denom = sc.nextInt();
            Fraction f2 = new Fraction(num, denom);

            if (t == 1) {
                f1.add(f2);
            } else if (t == 2) {
                f1.multiply(f2);
            }
        f1.display();
        }

    }
}

