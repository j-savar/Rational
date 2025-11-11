package ir.oliateaching.rational;

public class TestRational {
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 4);
        Rational r2 = new Rational(3, 6);
        Rational r3 = new Rational(1, 3);
        Rational r4 = new Rational(2, 3);

        System.out.println("Fraction1: " + r1);
        r1.simplify();
        System.out.println("Fraction1 after simplify: " + r1);
        System.out.println("Fraction2: " + r2);
        r2.simplify();
        System.out.println("Fraction2 after simplify: " + r2);
        System.out.println("Fraction3: " + r3);
        r3.simplify();
        System.out.println("Fraction3 after simplify: " + r3);
        System.out.println("Fraction4: " + r4);
        r4.simplify();
        System.out.println("Fraction4 after simplify: " + r4);
        System.out.println("\n--- Mathematical operations test ---");

        Rational sum = r1.add(r3);
        System.out.println(r1 + " + " + r3 + " = " + sum);

        Rational difference = r4.sub(r3);
        System.out.println(r4 + " - " + r3 + " = " + difference);

        Rational product = r1.mul(r4);
        System.out.println(r1 + " * " + r4 + " = " + product);

        Rational quotient = r4.div(r1);
        System.out.println(r4 + " / " + r1 + " = " + quotient);

        System.out.println("\n--- Convert to decimal ---");
        System.out.println(r1 + " = " + r1.toFloat());
        System.out.println(r3 + " = " + r3.toFloat());
        System.out.println(r4 + " = " + r4.toFloat());

        System.out.println("\n--- Testing special cases ---");
        Rational r5 = new Rational(-2, 4);
        System.out.println("negative fraction: " + r5);

        Rational r6 = new Rational(4, 2);
        System.out.println("Fraction equal to whole number: " + r6);

        Rational r7 = new Rational(0, 5);
        System.out.println("Zero: " + r7);
        System.out.println("Zero to decimal: " + r7.toFloat());
    }
}
