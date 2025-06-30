import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("a: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print("b: ");
        in = new Scanner(System.in);
        int b = in.nextInt();
        System.out.print("x: ");
        in = new Scanner(System.in);
        int x = in.nextInt();
        Equation eq1 = new Equation(x);
        Equation eq2 = new Equation(a, b);
        Equation eq3 = new Equation(a, x, b);
    }
}

class Equation {
    public int x, a, b;

    public Equation(int x) {
        this.x = x;
        line(x);
    }

    public Equation(int a, int b) {
        this.a = a;
        this.b = b;
        line(a, b);
    }

    public Equation(int a, int x, int b) {
        this.a = a;
        this.b = b;
        this.x = x;
        line(a, x, b);
    }

    public void line(int x) {
        System.out.println("y = 3x + 5 = " + (3 * x + 5));
    }

    public void line(int a, int b) {
        if (a - b != 0) {
            System.out.println("y = (a+b)/(a-b) = " + ((a + b) / (a - b)));
        } else {
            System.out.println("Делить на 0 нельзя");
        }
    }

    public void line(int a, int x, int b) {
        if (b != 0) {
            System.out.println("y = (ax/b)! = " + factorial((a * x) / b));
        } else {
            System.out.println("Делить на 0 нельзя");
        }
    }

    int factorial(int x) {
        if (x == 0) return 1;
        int res = 1;
        for (int i = 1; i <= x; i++) res *= i;
        return res;
    }
}