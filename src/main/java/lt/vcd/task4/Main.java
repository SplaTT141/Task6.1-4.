package lt.vcd.task4;

public class Main {

    static int sumOfDigits(int x) {

        if (x == 0) {
            return 0;
        }

        return (x % 10) + sumOfDigits(x / 10);
    }

    public static void main() {
        System.out.println(sumOfDigits(1342));
    }
}