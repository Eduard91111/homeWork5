import static java.util.Collections.reverse;

public class Main {
    public static void main(String[] args) {
        task4();
    }

    public static void task1() {
        int[] ferst = new int[3];
        ferst[0] = 1;
        ferst[1] = 2;
        ferst[2] = 3;
        System.out.println(ferst[0]);
        System.out.println(ferst[1]);
        System.out.println(ferst[2]);

        double[] two = {1.57, 7.654, 9.986};
        System.out.println(two[0]);
        System.out.println(two[1]);
        System.out.println(two[2]);

        boolean[] three = {1 > 3, 2 > 5, 3 > 7};
        System.out.println(three[0]);
        System.out.println(three[1]);
        System.out.println(three[2]);

    }

    public static void task2() {
        int[] ferst = new int[3];
        ferst[0] = 1;
        ferst[1] = 2;
        ferst[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i <= 1) {
                System.out.print(ferst[i] + ",");
            } else {
                System.out.print(ferst[i] + " ");
            }
        }
        double[] two = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            if (i <= 1) {
                System.out.print(two[i] + ",");
            } else {
                System.out.print(two[i] + " ");
            }
        }
        boolean[] three = {1 > 3, 2 > 5, 3 > 7};
        for (int i = 0; i < 3; i++) {
            if (i <= 1) {
                System.out.print(three[i] + ",");
            } else {
                System.out.print(three[i] + " ");
            }
        }
    }

    public static void task3() {
        int[] ferst = new int[3];
        ferst[0] = 1;
        ferst[1] = 2;
        ferst[2] = 3;
        int n = ferst.length;
        int newFerst;
        for (int i = 0; i < n / 2; i++) {
            newFerst = ferst[n - i - 1];
            ferst[n - i - 1] = ferst[i];
            ferst[i] = newFerst;
        }
        for (int i = 0; i < ferst.length; i++) {
            if (i <= 1) {
                System.out.print(ferst[i] + ", ");
            } else {
                System.out.print(ferst[i] + "\n");
            }
        }

        double[] two = {1.57, 7.654, 9.986};
        int a = two.length;
        double newTwo;
        for (int i = 0; i < a / 2; i++) {
            newTwo = two[a - i - 1];
            two[a - i - 1] = two[i];
            two[i] = newTwo;
        }
        for (int i = 0; i < two.length; i++) {
            if (i <= 1) {
                System.out.print(two[i] + ", ");
            } else {
                System.out.print(two[i] + "\n");
            }
        }
        boolean[] three = {1 > 3, 2 > 5, 3 > 7};
        int c = three.length;
        boolean newThree;
        for (int i = 0; i < c / 2; i++) {
            newThree = three[c - i - 1];
            three[c - i - 1] = three[i];
            three[i] = newThree;
        }
        for (int i = 0; i < three.length; i++) {
            if (i <= 1) {
                System.out.print(three[i] + ", ");
            } else {
                System.out.print(three[i]);
            }
        }
    }

    public static void task4() {
        int[] ferst = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 0; i < 12; i++) {
            if (ferst[i] % 2 == 1)
                ferst[i]++;
            System.out.println(ferst[i]);
        }
    }
}
