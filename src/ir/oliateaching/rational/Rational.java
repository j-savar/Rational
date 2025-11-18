package ir.oliateaching.rational;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    private int GreatestCommonDenominator(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void simplify() {
        int gcd = GreatestCommonDenominator(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    public Rational add(Rational r) {
        int newNumerator = this.numerator * r.denominator + this.denominator * r.numerator;
        int newDenominator = this.denominator * r.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational sub(Rational r) {
        int newNumerator = this.numerator * r.denominator - r.numerator * this.denominator;
        int newDenominator = this.denominator * r.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational mul(Rational r) {
        int newNumerator = this.numerator * r.numerator;
        int newDenominator = this.denominator * r.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational div(Rational r) {
        if (r.numerator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        int newNumerator = this.numerator * r.denominator;
        int newDenominator = this.denominator * r.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    public double toFloat() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }
}
