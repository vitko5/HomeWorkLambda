
// Створіть функціональний інтерфейс із методом, який приймає три значення int та повертає значення int.
// Створіть лямбда-функції (як змінні в основному методі), що реалізує цей інтерфейс:
// 1. Перша лямбда повертає максимальне значення
// 2. Друга - середнє значення
// 3. Третя - суму всіх трьох значень
// Викликати ці лямбди.

public class Main implements FuncInterface {

    public static void main(String[] args) {
        // Main values to test
        int a = randomInt(100,1000);
        int b = randomInt(100,1000);
        int c = randomInt(100,1000);

        // 1
        FuncInterface funcInterfaceMethodMax = (A,B,C) -> {
            if (A > B && A > C) {
                return A;
            } else return Math.max(B, C);
        };
        System.out.printf("Max from A:%s, B:%s, C:%s is %s\n",a,b,c,funcInterfaceMethodMax.funcInterfaceMethod(a,b,c));

        // 2
        FuncInterface funcInterfaceMethodAvg = (A,B,C) -> {
            return (A+B+C)/3;
        };
        System.out.printf("Average from A:%s, B:%s, C:%s is %s\n",a,b,c,funcInterfaceMethodAvg.funcInterfaceMethod(a,b,c));

        // 3
        FuncInterface funcInterfaceMethodSum = (A,B,C) -> {
            return A+B+C;
        };
        System.out.printf("Sum from A:%s, B:%s, C:%s is %s\n",a,b,c,funcInterfaceMethodSum.funcInterfaceMethod(a,b,c));
    }

    @Override
    public int funcInterfaceMethod(int A, int B, int C) {
        return 0;
    }

    public static int randomInt(int fromInt, int toInt) {
        return (int) ((Math.random() * (toInt - fromInt)) + fromInt);
    }
}
