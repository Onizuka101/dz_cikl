public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }


    public static void task1() {
        for (int i = 0; i < 10; i = i + 1)
            System.out.println("Итерация цикла " + i);
    }

    public static void task2() {
        for (int i = 10; 0 < i; i = i - 1)
            System.out.println("Итерация цикла " + i);
    }

    private static void task3() {
        for (int i = 0; i < 17; i = i + 2)
            System.out.println("Итерация цикла " + i);
    }

    private static void task4() {
        for (int i = 11; i > -11; i = i - 1)
            System.out.println("Итерация цикла " + i);
    }

    private static void task5() {
        for (int i = 1904; i < 2096; i = i + 4)
            System.out.println(i + "  год является високосным");
    }

    private static void task6() {
        for (int i = 7; i < 99; i = i + 7)
            System.out.println(i);
    }

    private static void task7() {
        for (int i = 1; i < 600; i = i * 2)
            System.out.println(i);
    }

    private static void task8() {
        int n = 2900;
        int s = 0;
        for (int i = 1; i <= 12; i = i + 1) {
            s = s + n;
            System.out.println("«Месяц" + i + "…, сумма накоплений равна" + s + "рублей».");
        }
    }
    private static void task9() {
        int n = 2900;
        int s = 0;
        for (int i = 1; i <= 12; i = i + 1) {
            s= s + s/100;
            s = s + n;
            System.out.println("«Месяц" + i + "…, сумма накоплений равна" + s + "рублей».");
        }
    }
    private static void task10() {
        int n = 2;
        int s = 0;
        for (int i = 1; i <= 10; i = i + 1) {
            s = i * n;
            System.out.println(n + "*" + i + "=" + s);
        }
    }
}