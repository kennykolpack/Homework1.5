public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int[] first = new int[] {1, 2, 3};
        double[] second = {1.57, 7.654, 9.986};
        int[] third = {123, 321, 456, 654, 789, 987};
        // Задача 2
        System.out.println("Задача 2");
        for (int i = 0; i < first.length; i++) {
            if (i < 2) {
                System.out.print(first[i] + ", ");
            } else {
                System.out.println(first[i]);
            }
        }
        for (int i = 0; i < second.length; i++) {
            if (i < 2) {
                System.out.print(second[i] + ", ");
            } else {
                System.out.println(second[i]);
            }
        }
        for (int i = 0; i < third.length; i++) {
            if (i < 5) {
                System.out.print(third[i] + ", ");
            } else {
                System.out.println(third[i]);
            }
        }
        // Задача 3
        System.out.println("Задача 3");
        for (int i = first.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(first[i] + ", ");
            } else {
                System.out.println(first[i]);
            }
        }
        for (int i = second.length - 1; i >=0; i--) {
            if (i > 0) {
                System.out.print(second[i] + ", ");
            } else {
                System.out.println(second[i]);
            }
        }
        for (int i = third.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(third[i] + ", ");
            } else {
                System.out.println(third[i]);
            }
        }
        // Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < first.length; i++) {
            if (i % 2 == 0) {
                first[i] = first[i] + 1;
                System.out.println(first[i]);
            }
        }
    }
}