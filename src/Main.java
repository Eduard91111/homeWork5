public class Main {
    public static void main(String[] args) {
        Task4();
    }
     public static void Task1() {
        int [] ferst = new int [3];
        ferst [0] = 1;
        ferst [1] = 2;
        ferst [2] = 3;
        System.out.println(ferst[0]);
        System.out.println(ferst[1]);
        System.out.println(ferst[2]);

         double [] two = {1.57, 7.654, 9.986};
         System.out.println(two[0]);
         System.out.println(two[1]);
         System.out.println(two[2]);

         boolean [] three = { 1>3, 2>5, 3>7};
         System.out.println(three[0]);
         System.out.println(three[1]);
         System.out.println(three[2]);

    }
    public static void Task2() {
        int [] ferst = new int [3];
        ferst [0] = 1;
        ferst [1] = 2;
        ferst [2] = 3;
        System.out.print(ferst[0]);
        System.out.print(",");
        System.out.print(ferst[1]);
        System.out.print(",");
        System.out.print(ferst[2]);
        System.out.print(" ");

        double [] two = {1.57, 7.654, 9.986};
        System.out.print(two[0]);
        System.out.print(",");
        System.out.print(two[1]);
        System.out.print(",");
        System.out.print(two[2]);
        System.out.print(" ");

        boolean [] three = { 1>3, 2>5, 3>7};
        System.out.print(three[0]);
        System.out.print(",");
        System.out.print(three[1]);
        System.out.print(",");
        System.out.print(three[2]);
    }
    public static void Task3() {
        int [] ferst = new int [3];
        ferst [0] = 1;
        ferst [1] = 2;
        ferst [2] = 3;
        System.out.print(ferst[2]);
        System.out.print(",");
        System.out.print(ferst[1]);
        System.out.print(",");
        System.out.print(ferst[0]);
        System.out.print("\n");

        double [] two = {1.57, 7.654, 9.986};
        System.out.print(two[2]);
        System.out.print(",");
        System.out.print(two[1]);
        System.out.print(",");
        System.out.print(two[0]);
        System.out.print("\n");

        boolean [] three = { 1>3, 2>5, 3>7};
        System.out.print(three[2]);
        System.out.print(",");
        System.out.print(three[1]);
        System.out.print(",");
        System.out.print(three[0]);
    }
    public static void Task4() {
        int [] ferst = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 0; i < 12; i++) {
            ferst [i]++;
            if (ferst [i] % 2 == 0) {
                System.out.println(ferst[i]);
            }
        }
    }

}
