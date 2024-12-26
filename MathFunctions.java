public class MathFunctions {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }

    int abs(int a) {
        if (a < 0) return -a;
        else return a;
    }

    int pow(int a) {
        return a * a;
    }
}