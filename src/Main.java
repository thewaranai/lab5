import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Выберите выражение:\n1. y=3x+5\n2. y=(a+b)/(a-b)\n3. y=(ax/b)!");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        Calculator calc = new Calculator();
        if (choice == 1){
            calc.firstMath();
        } else if (choice == 2) {
            calc.secondMath();
        }
        else if (choice == 3){
            calc.thirdMath();
        }
    }
}
class Calculator {
    Scanner in = new Scanner(System.in);
    public void firstMath(){
        System.out.println("Введите х:");
        double x = in.nextDouble();
        double y = 3 * x + 5;
        System.out.println("3*" + x + "+5=" + y);
    }
    public void secondMath(){
        System.out.println("Введите a:");
        double a = in.nextDouble();
        System.out.println("Введите b:");
        double b = in.nextDouble();
        double y = (a+b) / (a-b);
        System.out.println("(" + a + "+" + b + ") / (" + a + "-" + b + ")=" + y);
    }
    public void thirdMath(){
        System.out.println("Введите a:");
        double a = in.nextDouble();
        System.out.println("Введите х:");
        double x = in.nextDouble();
        System.out.println("Введите b:");
        double b = in.nextDouble();
        double y = factorial((a * x) / b);
        System.out.println("(" + a + "*" + x + "/" + b + ")=" + y);
    }
    public static long factorial(double n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}