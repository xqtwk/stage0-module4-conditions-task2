package school.mjc.stage0.conditions.task2;


public class GreatestNumberPrinter {
    public static void printGreatest(int first, int second) {
        if (first > second) {
            System.out.println(first);
        } else if(first < second) {
            System.out.println(second);
        } else {
            System.out.println(first);
        }
    }
}
